package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class EliminarFila {

    @Test 
    public void EliminarLineaCompleta() {
        Board board = new Board(4, 4);

        board.getBoard()[0] = new int[] {0, 0, 0, 0};
        board.getBoard()[1] = new int[] {1, 1, 1, 1}; 
        board.getBoard()[2] = new int[] {0, 1, 0, 1};
        board.getBoard()[3] = new int[] {1, 0, 1, 0};

        board.EliminarLinea();

        int[][] esperado = {
            {0, 0, 0, 0},
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 0, 0, 0}
        };

        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], board.getBoard()[i]);
        }
    }
}