package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
 public void CreaPieza () {
    int filas = 10 ;
    int columnas = 20; 

    int matriz [][]= new int [filas][columnas];

    for (int i = 0; i<filas; i++){
        for (int j = 0; j<columnas; j++){

            assertEquals(0, matriz[i][j]);
        }
    }
    
 }
}
