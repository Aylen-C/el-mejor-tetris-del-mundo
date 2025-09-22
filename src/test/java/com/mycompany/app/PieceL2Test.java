package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceL2Test {

    @Test
    public void formaNormal() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,2},
            {1,2},
            {2,1}, {2,2}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }

    @Test
    public void formaDerecha() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {1,0}, {1,1}, {1,2},
            {2,2}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }
}