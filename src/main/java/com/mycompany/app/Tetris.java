package com.mycompany.app;

public class Tetris {

    private Board board;
    private Clock clock;
    private PieceBase PiezaActual;

    public Tetris() {
        this(20, 10); 
    }

    public Tetris(int filas, int columnas) {
        this.board = new Board(filas, columnas);
        this.clock = new Clock();
        this.PiezaActual = null;
    }
    
    //el juego comienza cuando hay una pieza en el tablero
    public void start(){
        this.PiezaActual = PieceBase.nuevaPieza();
        this.board.setPiezaActual(this.PiezaActual.forma(), 0, 0);
    }

    public String state(){

        if(PiezaActual == null){
            return "El juego no ha comenzado";
        }
        return "Hay una pieza en el tablero, las líneas completadas son: " + board.lineCount();

}

    public void rotateLeft(){
        if(PiezaActual == null){
         PiezaActual.rotateLeft();
        }
        
    }

    public void rotateRight(){
        if(PiezaActual == null){
         PiezaActual.rotateRight();
        }
        
    }

    public void tick (){
        if (clock.tick() && PiezaActual != null){
            boolean puedebajar= board.moveDown();
            if (!puedebajar){
                this.PiezaActual = PieceBase.nuevaPieza();
                this.board.setPiezaActual(this.PiezaActual.forma(), 0, 0);
            }
        }
    }

    public static void main(String[] args) {
        Tetris juego = new Tetris(20, 10);
        juego.start();

        for (int i = 0; i < 40; i++) {
            juego.tick();
            juego.state();
        }

        
    }
}
