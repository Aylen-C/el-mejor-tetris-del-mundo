package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceLTest {

    @Test
    public void creaPiezaL() {
        int filas = 3;
        int columnas = 2;

        int matriz[][] = new int[filas][columnas]; 

        for (int i = 0; i < filas; i++) { 
            for (int j = 0; j < columnas; j++) {
                assertEquals(0, matriz[i][j]);
            }
        }
    }

    @Test
    public void asignaValoresL() {
        String matriz[][] = new String[3][2]; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = ".";
            }
        }

        //  L derecha 
        matriz[0][1] = "*";
        matriz[1][1] = "*";
        matriz[2][1] = "*";
        matriz[2][0] = "*";

        assertEquals("*", matriz[0][1]);
        assertEquals("*", matriz[1][1]);
        assertEquals("*", matriz[2][1]);
        assertEquals("*", matriz[2][0]);

        assertEquals(".", matriz[0][0]);
        assertEquals(".", matriz[1][0]);
    }

    @Test
    public void asignaValoresLIzquierda() {
        String matriz[][] = new String[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = ".";
            }
        }

        // L izq
        matriz[0][0] = "*";
        matriz[1][0] = "*";
        matriz[2][0] = "*";
        matriz[2][1] = "*";

        assertEquals("*", matriz[0][0]);
        assertEquals("*", matriz[1][0]);
        assertEquals("*", matriz[2][0]);
        assertEquals("*", matriz[2][1]);

        assertEquals(".", matriz[0][1]);
        assertEquals(".", matriz[1][1]);
    }
}