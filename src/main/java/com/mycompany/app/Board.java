package com.mycompany.app;

public class Board {

    private int filas; 
    private int columnas;
    private int [][] board;
    private int [][] piezaActual; // la pieza que está cayendo
    private int lineCount = 0; // contador de lineas eliminadas


    public Board(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.board = new int [filas][columnas]; // inicializa con 0
        this.piezaActual = null;
    }
    
    public void moveLeft() {
        for (int i = 0; i < 4; i++) {
            piezaActual[i][1] -= 1; // mueve cada bloque una columna a la izquierda
        }
    }

    public void moveRight() {
        for (int i = 0; i < 4; i++) {
            piezaActual[i][1] += 1; // mueve cada bloque una columna a la derecha
        }
    }

    public int lineCount() { // cuenta las lineas eliminadas
        return lineCount;
    }

    public boolean lineCount(int n) {
        return lineCount >= n;
    }

    public int EliminarFila(){
        int eliminadas = 0;
        for (int fila = filas - 1; fila >= 0; fila--) { // recorre las lineas del tablero
            boolean completa = true;
            for (int columna = 0; columna < columnas; columna++) {
                if (board[fila][columna] == 0) { // si encuentra un espacio vacio no esta completa
                    completa = false;
                    break;
                }
            }
            if (completa) { //si la linea esta completa
                for (int f = fila; f > 0; f--) { // baja todas las filas una posicion
                    for (int c = 0; c < columnas; c++) {
                        board[f][c] = board[f - 1][c];
                    }
                }
                for (int c = 0; c < columnas; c++) {
                    board[0][c] = 0; // limpia la fila superior
                }
                lineCount++; // incrementa el contador de lineas eliminadas
                eliminadas++;
                fila++; // vuelve a verificar la misma fila ya que todas las filas han bajado
            }
        }
        return eliminadas;
    }

    // elige una nueva pieza
    public void setPiezaActual(int[][] nuevaPieza, int fila, int columna) { //se arreglo para colocar la pieza en las coordenadas iniciales
        for (int i = 0; i < 4; i++) {
            nuevaPieza[i][0] += fila; 
            nuevaPieza[i][1] += columna;
        }
        this.piezaActual = nuevaPieza;
    }

    public int[][] getPiezaActual() {
        return piezaActual;
    }

    public boolean Colocar(int[][] pieza) {
                        // 4 cantidad de bloques
        for (int i = 0; i < 4; i++) { // valida que la pieza no se salga del tablero
            int fila = pieza[i][0];
            int columna = pieza[i][1];
            if (estaFuera(fila, columna)) return false;
        }

        // colocar la pieza en el tablero y marca con un 1 si los lugares estan bien
        for (int i = 0; i < 4; i++) { // 4 cantidad de bloques
            int fila = pieza[i][0];
            int columna = pieza[i][1];
            board[fila][columna] = 1;
        }
        return true;
    }

    public int getCelda(int fila, int columna) { // pregunta el estado de una celda
        if (estaFuera(fila, columna))
            return -1;     // fuera del tablero
        return board[fila][columna];
    }

    // devuelve true si la celda está fuera del tablero
    private boolean estaFuera(int fila, int columna) {
        return (fila < 0 || fila >= filas || columna < 0 || columna >= columnas);
    }
    
    // baja la pieza actual una fila si puede
    public boolean moveDown() {
        if (piezaActual == null) return false;
        // verifica si la pieza puede bajar


        for (int i = 0; i < 4; i++) {// recorre cada bloque
            int filaActual = piezaActual[i][0];
            int columnaActual = piezaActual[i][1];
            int filaAbajo = filaActual + 1; // calcula fila debajo de la pieza
            if (filaAbajo >= filas || board[filaAbajo][columnaActual] == 1) { // esta afuera u ocupada
                Colocar(piezaActual); // fija pieza
                EliminarFila(); // elimina lineas completas
                piezaActual = null; // ya no hay pieza activa
                return false; // no puede bajar
            }
        }
        // Si puede, baja todos los bloques
        for (int i = 0; i < 4; i++) {
            piezaActual[i][0]++; //baja una fila
        }
        return true;
    }

        public boolean intentaColocar (int[][] nuevaPieza, int fila, int columna) { //se arreglo para colocar la pieza en las coordenadas iniciales
        for (int i = 0; i < 4; i++) {
           int a = nuevaPieza[i][0] + fila; 
           int b = nuevaPieza[i][1] + columna;

           if(a<0 || a>=filas || b<0 || b>=columnas){
            return false; // no puede colocar la pieza
        }

              nuevaPieza[i][0] = a; 
              nuevaPieza[i][1] = b;
          }
        this.piezaActual = nuevaPieza;
        
        return true; // pudo colocar la pieza

    }

}