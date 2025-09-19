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
        @Test
    public void noPuedeDescenderCuandoHayObstaculo() {
        PieceStick pieza = new PieceStick();
        pieza.setPosicionActual(1); // vertical
        String[][] tablero = new String[5][1];
        for (int i = 0; i < 5; i++)
            tablero[i][0] = ".";
        tablero[4][0] = "*";
        boolean puedeBajar = pieza.puedeDescender(tablero, 0, 0);
        assertEquals(false, puedeBajar);
    }

    @Test
    public void noPuedeRotarSiChocaConOtraPieza() {
        PieceStick pieza = new PieceStick();
        pieza.setPosicionActual(1); // vertical
        String[][] tablero = new String[1][4];
        for (int j = 0; j < 4; j++)
            tablero[0][j] = ".";

        tablero[0][2] = "*";
        boolean puedeRotar = pieza.puedeRotar(tablero, 0, 0);
        assertEquals(false, puedeRotar);
    }
}