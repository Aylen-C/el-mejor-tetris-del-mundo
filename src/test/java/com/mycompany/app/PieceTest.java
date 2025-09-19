package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceTest {

    @Test
    public void testPosicionInicial() {
        Piece pieza = new PieceL(); 
        assertEquals(0, pieza.getPosicionActual());
    }

    @Test
    public void testRotateRight() {
        Piece pieza = new PieceL();
        pieza.rotateRight();
        assertEquals(1, pieza.getPosicionActual());
    }

    @Test
    public void testRotateLeft() {
        Piece pieza = new PieceL();
        pieza.rotateLeft();
        assertEquals(3, pieza.getPosicionActual());
    }
}