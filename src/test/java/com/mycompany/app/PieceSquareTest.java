package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class PieceSquareTest {


    @Test
    public void CreaPieza () {
    int filas= 2;
    int columnas = 2; 

    int matriz [][]= new int [filas][columnas];

    for (int i; i<filas; i++){
        for (int j; j<columnas; j++){

            assertEquals(0, matriz[i][j]);
        }
    }
    }


     @Test
     public void AsignaValores (){ 
     
     matriz[0][0] = *; 
     matriz[0][1]= *;
     matriz[1][0]= *; 
     matriz[1][1]= *; 

}



}

