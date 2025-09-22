package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceSquareTest {

    @Test
    public void formaNormal() {
        PieceSquare pieza = new PieceSquare();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1},
            {1,0}, {1,1}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }

    @Test
    public void formaDerecha() {
        PieceSquare pieza = new PieceSquare();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {0,0}, {0,1},
            {1,0}, {1,1}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }
}