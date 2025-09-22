package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceTTest {

    @Test
    public void formaNormal() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1}, {0,2},
                   {1,1}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }

    @Test
    public void formaDerecha() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(1);
        int[][] esperado = {
                  {0,2},
            {1,1}, {1,2},
                  {2,2}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }

    @Test
    public void formaAbajo() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(2);
        int[][] esperado = {
                  {1,1},
            {2,0}, {2,1}, {2,2}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
    }

    @Test
    public void formaIzquierda() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(3);
        int[][] esperado = {
            {0,0},
            {1,0}, {1,1},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i]);
        }
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