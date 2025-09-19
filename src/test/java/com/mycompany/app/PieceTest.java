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
        @Test
    public void noPuedeDescenderCuandoHayObstaculo() {
        Piece pieza = new PieceL();
        pieza.setPosicionActual(0);
        String[][] tablero = new String[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                tablero[i][j] = ".";
        tablero[3][1] = "*";
        tablero[3][0] = "*";
        boolean puedeBajar = pieza.puedeDescender(tablero, 1, 0);
        assertEquals(false, puedeBajar);
    }

    @Test
    public void noPuedeRotarSiChocaConOtraPieza() {
        Piece pieza = new PieceL();
        pieza.setPosicionActual(0);
        String[][] tablero = new String[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                tablero[i][j] = ".";
        tablero[2][1] = "*";
        boolean puedeRotar = pieza.puedeRotar(tablero, 1, 0);
        assertEquals(false, puedeRotar);
    }
}