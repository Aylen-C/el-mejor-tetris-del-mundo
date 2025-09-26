package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PieceDog2Test {

    @Test
    public void formaNormal() {
        PieceDog2 pieza = new PieceDog2();
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
        PieceDog2 pieza = new PieceDog2();
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