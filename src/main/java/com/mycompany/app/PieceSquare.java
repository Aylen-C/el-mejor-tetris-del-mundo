package com.mycompany.app;

public class PieceSquare extends Piece{
    
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
}