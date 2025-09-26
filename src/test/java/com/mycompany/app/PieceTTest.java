package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceTTest {

    @Test
    public void formaNormal() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1}, {0,2},
                   {1,1}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerecha() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(1);
        int[][] esperado = {
                  {0,2},
            {1,1}, {1,2},
                  {2,2}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaAbajo() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(2);
        int[][] esperado = {
                  {1,1},
            {2,0}, {2,1}, {2,2}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaIzquierda() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(3);
        int[][] esperado = {
            {0,0},
            {1,0}, {1,1},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }
}
