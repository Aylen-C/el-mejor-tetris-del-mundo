package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceDog2Test {

    @Test
    public void formaHorizontal() {
        PieceDog2 pieza = new PieceDog2();
        pieza.setPosicionActual(0);
        String[][] esperado = {
            {"*", "*", "."},
            {".", "*", "*"},
            {".", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void formaVertical() {
        PieceDog2 pieza = new PieceDog2();
        pieza.setPosicionActual(1);
        String[][] esperado = {
            {".", "*", "."},
            {"*", "*", "."},
            {"*", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void formaHorizontalInvertida() {
        PieceDog2 pieza = new PieceDog2();
        pieza.setPosicionActual(2);
        String[][] esperado = {
            {".", ".", "."},
            {"*", "*", "."},
            {".", "*", "*"}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void formaVerticalInvertida() {
        PieceDog2 pieza = new PieceDog2();
        pieza.setPosicionActual(3);
        String[][] esperado = {
            {"*", ".", "."},
            {"*", "*", "."},
            {".", "*", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }
}