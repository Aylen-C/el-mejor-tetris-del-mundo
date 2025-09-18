package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceLTest {

    @Test
    public void testFormaLNormal() {
        PieceL pieza = new PieceL();
        pieza.posicionActual = 0;
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
        pieza.posicionActual = 1;
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
        pieza.posicionActual = 2;
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
        pieza.posicionActual = 3;
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
}