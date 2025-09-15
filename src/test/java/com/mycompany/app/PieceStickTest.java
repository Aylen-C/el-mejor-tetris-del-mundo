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
}
