package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceStickTest {

    @Test
    public void formaNormal() {
        PieceStick pieza = new PieceStick();
        pieza.setPosicionActual(0); // horizontal
        int[][] esperado = {
            {0,0}, {0,1}, {0,2}, {0,3}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerecha() {
        PieceStick pieza = new PieceStick();
        pieza.setPosicionActual(1); // vertical
        int[][] esperado = {
            {0,0},
            {1,0},
            {2,0},
            {3,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }
}