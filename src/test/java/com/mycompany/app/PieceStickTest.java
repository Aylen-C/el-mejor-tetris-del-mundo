package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceStickTest {

    @Test
    public void creaPiezaStick() {
        int filas = 4;
        int columnas = 1;

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                assertEquals(0, matriz[i][j]);
            }
        }
    }

    @Test
    public void asignaValoresStick() {
        String matriz[][] = new String[4][1];

      
        for (int i = 0; i < 4; i++) {
            matriz[i][0] = ".";
        }

        matriz[0][0] = "*";
        matriz[1][0] = "*";
        matriz[2][0] = "*";
        matriz[3][0] = "*";

        assertEquals("*", matriz[0][0]);
        assertEquals("*", matriz[1][0]);
        assertEquals("*", matriz[2][0]);
        assertEquals("*", matriz[3][0]);
    }
}