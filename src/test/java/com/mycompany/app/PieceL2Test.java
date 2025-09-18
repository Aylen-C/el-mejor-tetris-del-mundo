package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceL2Test {

    @Test
    public void testFormaL2Normal() {
        PieceL2 pieza = new PieceL2();
        pieza.posicionActual = 0;
        String[][] esperado = {
            {".", ".", "*"},
            {".", ".", "*"},
            {".", "*", "*"}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaL2RotadaDerecha() {
        PieceL2 pieza = new PieceL2();
        pieza.posicionActual = 1;
        String[][] esperado = {
            {".", ".", "."},
            {"*", "*", "*"},
            {".", ".", "*"}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaL2RotadaAbajo() {
        PieceL2 pieza = new PieceL2();
        pieza.posicionActual = 2;
        String[][] esperado = {
            {"*", "*", "."},
            {"*", ".", "."},
            {"*", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaL2RotadaIzquierda() {
        PieceL2 pieza = new PieceL2();
        pieza.posicionActual = 3;
        String[][] esperado = {
            {"*", ".", "."},
            {"*", "*", "*"},
            {".", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }
}

