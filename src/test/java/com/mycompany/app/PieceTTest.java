package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PieceTTest {
    
    @Test
    public void CreaPieza() {
        int filas = 3;
        int columnas = 3;

        int matriz [][]= new int [filas][columnas];

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){

                assertEquals(0, matriz[i][j]);
            }
        }
    }


    @Test
    public void testNormal(){
        PieceT pieza = new PieceT();
        String [][] m = pieza.forma();

        // FILA 1
        assertEquals("*", m[0][0]);
        assertEquals("*", m[0][1]);
        assertEquals("*", m[0][2]);

        // FILA 2
        assertEquals(".", m[1][0]);
        assertEquals("*", m[1][1]);
        assertEquals(".", m[1][2]);

        // FIlA 3
        assertEquals(".", m[2][0]);
        assertEquals(".", m[2][1]);
        assertEquals(".", m[2][2]);
    }

    @Test
    public void testDerecha(){
        PieceT pieza = new PieceT();
        pieza.rotateRight();
        String[][] m = pieza.forma();

        // FILA 1
        assertEquals(".", m[0][0]);
        assertEquals(".", m[0][1]);
        assertEquals("*", m[0][2]);

        // FILA 2
        assertEquals(".", m[1][0]);
        assertEquals("*", m[1][1]);
        assertEquals("*", m[1][2]);

        // FIlA 3
        assertEquals(".", m[2][0]);
        assertEquals(".", m[2][1]);
        assertEquals("*", m[2][2]);
    }

    @Test
    public void testAbajo() {
        PieceT pieza = new PieceT();
        pieza.rotateRight();
        pieza.rotateRight();
        String[][] m = pieza.forma();

        // FILA 1
        assertEquals(".", m[0][0]);
        assertEquals(".", m[0][1]);
        assertEquals(".", m[0][2]);

        // FILA 2
        assertEquals(".", m[1][0]);
        assertEquals("*", m[1][1]);
        assertEquals(".", m[1][2]);

        // FIlA 3
        assertEquals("*", m[2][0]);
        assertEquals("*", m[2][1]);
        assertEquals("*", m[2][2]);

    }
    
    @Test
    public void testIzquierda() {
        PieceT pieza = new PieceT();
        pieza.rotateLeft();
        String[][] m = pieza.forma();

        // FILA 1
        assertEquals("*", m[0][0]);
        assertEquals(".", m[0][1]);
        assertEquals(".", m[0][2]);

        // FILA 2
        assertEquals("*", m[1][0]);
        assertEquals("*", m[1][1]);
        assertEquals(".", m[1][2]);

        // FIlA 3
        assertEquals("*", m[2][0]);
        assertEquals(".", m[2][1]);
        assertEquals(".", m[2][2]);
    }

}





    /*
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
 */