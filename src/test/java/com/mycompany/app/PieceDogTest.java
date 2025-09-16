package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
     public void AsignaValores (){ 

        String matriz [][] = new String [2][3];
     
     matriz[0][0] ="*"; 
     matriz[0][1]= "*";
     matriz[1][0]= "*"; 
     matriz[1][1]= "*"; 

     assertEquals("*", matriz[0][0]);
     assertEquals("*", matriz[0][1]);
     assertEquals("*", matriz[1][0]);
     assertEquals("*", matriz[1][1]);

}

}