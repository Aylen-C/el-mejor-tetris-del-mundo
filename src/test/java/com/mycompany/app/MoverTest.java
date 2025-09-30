package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class MoverTest {

    @Test
    public void moverDerecha() {
        Board board = new Board(20, 10);
        PieceSquare square = new PieceSquare();
        board.setPiezaActual(square.forma(), 0, 5);


        board.moveRight();
        board.Colocar(board.getPiezaActual());

        assertEquals(1, board.getCelda(0,6));
        assertEquals(1, board.getCelda(0,7));
        assertEquals(1, board.getCelda(1,6));
        assertEquals(1, board.getCelda(1,7));

    }

    @Test
    public void moverIzquierda() {
        Board board = new Board(20, 10);
        PieceSquare square = new PieceSquare();
        board.setPiezaActual(square.forma(), 0, 5);

        board.moveLeft();
        board.Colocar(board.getPiezaActual());

        assertEquals(1, board.getCelda(0,4));
        assertEquals(1, board.getCelda(0,5));
        assertEquals(1, board.getCelda(1,4));
        assertEquals(1, board.getCelda(1,5));

    }
}