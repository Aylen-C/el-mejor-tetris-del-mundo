package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceLTest {

    @Test
    public void formaNormal() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0},
            {1,0},
            {2,0}, {2,1}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerecha() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {1,0}, {1,1}, {1,2},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }
}