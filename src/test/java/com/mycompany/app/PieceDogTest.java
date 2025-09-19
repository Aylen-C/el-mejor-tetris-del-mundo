package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceDogTest {

    @Test
    public void CreaPieza () {
    int filas = 2;
    int columnas = 3; 

    int matriz [][]= new int [filas][columnas];

    for (int i = 0; i<filas; i++){
        for (int j = 0; j<columnas; j++){

            assertEquals(0, matriz[i][j]);
        }
    }
    }

     @Test
    public void asignaValoresDog() {
        String matriz[][] = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ".";
            }
        }

        // dog normal (S)
        matriz[0][1] = "*";
        matriz[0][2] = "*";
        matriz[1][0] = "*";
        matriz[1][1] = "*";

        // comprueba la forma
        assertEquals(".", matriz[0][0]);
        assertEquals("*", matriz[0][1]);
        assertEquals("*", matriz[0][2]);
        assertEquals("*", matriz[1][0]);
        assertEquals("*", matriz[1][1]);
        assertEquals(".", matriz[1][2]);
    }
}
