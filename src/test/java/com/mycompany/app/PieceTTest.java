package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PieceTTest {

    @Test
    public void CreaPieza() {
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
     public void AsignaValores (){
        
        String matriz [][] = new String [2][3];

        // INICIALIZA
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = ".";
            }
        }

        // T
        matriz[0][0] ="*"; 
        matriz[0][1]= "*";
        matriz[0][2]= "*"; 
        matriz[1][1]= "*"; 
        
        // comprueba
        assertEquals("*", matriz[0][0]);
        assertEquals("*", matriz[0][1]);
        assertEquals("*", matriz[0][2]);
        assertEquals("*", matriz[1][1]);
        
        // relleno
        assertEquals(".", matriz[1][0]);
        assertEquals(".", matriz[1][2]);

    }
}



// qsy