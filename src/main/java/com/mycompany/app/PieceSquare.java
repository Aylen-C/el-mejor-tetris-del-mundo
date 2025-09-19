package com.mycompany.app;

public class PieceSquare extends Piece {
    
    @Override
    public void rotateRight() { // no rota
    }

    @Override
    public void rotateLeft() { // no rota
    }

    @Override
    public String[][] forma() {
        // devuelve la forma del cuadrado
        return new String[][] {
            {"*", "*"},
            {"*", "*"}
        };
    }

    @Override
    public boolean puedeDescender(String[][] tablero, int fila, int columna) {

        if (fila + 2 >= tablero.length) {
            return false;
        }
  
        return tablero[fila + 2][columna].equals(".") && tablero[fila + 2][columna + 1].equals(".");
    }

    @Override
    public boolean puedeRotar(String[][] tablero, int fila, int columna) {
        return true;
    }
}