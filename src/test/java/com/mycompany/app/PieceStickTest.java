package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceStickTest {

    @Test
    public void creaPiezaStick() {
        int filas = 4;
        int columnas = 1;

    int matriz[][] = new int[filas][columnas]; // crea una matriz de 4 filas y 1 columna

        for (int i = 0; i < filas; i++) { // inicializa la matriz con 0
            for (int j = 0; j < columnas; j++) {
                assertEquals(0, matriz[i][j]);
            } 
        }
    }

    @Test
    public void asignaValoresStick() {
        String matriz[][] = new String[4][1]; // crea una matriz de 4 filas y 1 columna

      
        for (int i = 0; i < 4; i++) { // inicializa la matriz con "."
            matriz[i][0] = "."; 
        }

        matriz[0][0] = "*"; // asigna los valores para formar la pieza "Stick"
        matriz[1][0] = "*";
        matriz[2][0] = "*";
        matriz[3][0] = "*";

        assertEquals("*", matriz[0][0]); // comprueba que los valores se asignaron correctamente
        assertEquals("*", matriz[1][0]);
        assertEquals("*", matriz[2][0]);
        assertEquals("*", matriz[3][0]);
    }
}