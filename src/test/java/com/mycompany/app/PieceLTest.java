package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceLTest {

    @Test
    public void testFormaLNormal() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(0);
        String[][] esperado = {
            {"*", ".", "."},
            {"*", ".", "."},
            {"*", "*", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaLRotadaDerecha() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(1);
        String[][] esperado = {
            {".", ".", "."},
            {"*", "*", "*"},
            {"*", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaLRotadaAbajo() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(2);
        String[][] esperado = {
            {"*", "*", "."},
            {".", "*", "."},
            {".", "*", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaLRotadaIzquierda() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(3);
        String[][] esperado = {
            {".", ".", "*"},
            {"*", "*", "*"},
            {".", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }
     @Test
    public void noPuedeDescenderCuandoHayObstaculo() {
        PieceL pieza = new PieceL();
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
        PieceL pieza = new PieceL();
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