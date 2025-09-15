package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class PieceStickTest {

    @Test
    void testCreacionPiezaStick() {
        PieceStick stick = new PieceStick(0, 0);
        int[][] esperado = {
            {0, 0},
            {0, 1},
            {0, 2},
            {0, 3}
        };
        assertTrue(Arrays.deepEquals(esperado, stick.getCells()), "La pieza Stick debe tener la forma vertical inicial correcta");
    }

    @Test
    void testRotacionDerechaPiezaStick() {
        PieceStick stick = new PieceStick(0, 0);
        stick.rotateRight();
        int[][] esperado = {
            {0, 0},
            {1, 0},
            {2, 0},
            {3, 0}
        };
        assertTrue(Arrays.deepEquals(esperado, stick.getCells()), "La pieza Stick debe tener la forma horizontal tras rotar a la derecha");
    }

    @Test
    void testRotacionIzquierdaPiezaStick() {   
        PieceStick stick = new PieceStick(0, 0);
        stick.rotateLeft();
        int[][] esperado = {
            {0, 0},
            {1, 0},
            {2, 0},
            {3, 0}
        };
        assertTrue(Arrays.deepEquals(esperado, stick.getCells()), "La pieza Stick debe tener la forma horizontal tras rotar a la izquierda");
    }
}