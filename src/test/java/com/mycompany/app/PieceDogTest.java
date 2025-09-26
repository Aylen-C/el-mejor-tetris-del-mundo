package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceDogTest {

    @Test
    public void formaNormal() {
        PieceDog pieza = new PieceDog();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1},
                   {1,1}, {1,2}    
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerecha() {
        PieceDog pieza = new PieceDog();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {0,1},
            {1,0}, {1,1},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }
}