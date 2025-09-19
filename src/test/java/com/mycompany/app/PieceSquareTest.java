package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class PieceSquareTest {

    @Test
    public void CreaPieza () {
    int filas = 2;
    int columnas = 2; 

    int matriz [][]= new int [filas][columnas];

    for (int i = 0; i<filas; i++){
        for (int j = 0; j<columnas; j++){

            assertEquals(0, matriz[i][j]);
        }
    }
    }

     @Test
     public void AsignaValores (){ 

        String matriz [][] = new String [2][2];
     
     matriz[0][0] ="*"; 
     matriz[0][1]= "*";
     matriz[1][0]= "*"; 
     matriz[1][1]= "*"; 

     assertEquals("*", matriz[0][0]);
     assertEquals("*", matriz[0][1]);
     assertEquals("*", matriz[1][0]);
     assertEquals("*", matriz[1][1]);

}

   @Test 
    public void rotar() {
    String[][] antes = {
        {"*", "*"},
        {"*", "*"}
    };
    String[][] despues = {
        {"*", "*"},
        {"*", "*"}
    };
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 2; j++)
            assertEquals(antes[i][j], despues[i][j]);
}
 @Test
    public void noPuedeDescenderCuandoHayObstaculo() {
        PieceSquare pieza = new PieceSquare();
        String[][] tablero = new String[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                tablero[i][j] = ".";
        tablero[2][1] = "*";
        tablero[2][0] = "*";
        boolean puedeBajar = pieza.puedeDescender(tablero, 0, 0);
        assertEquals(false, puedeBajar);
    }

    @Test
    public void puedeRotarSiempre() {
        PieceSquare pieza = new PieceSquare();
        String[][] tablero = new String[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                tablero[i][j] = ".";
        boolean puedeRotar = pieza.puedeRotar(tablero, 0, 0);
        assertEquals(true, puedeRotar);
    }
}