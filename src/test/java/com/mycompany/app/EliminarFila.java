package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EliminarFila {

    @Test 
    public void EliminarLineaCompleta() {//con cuadrados
        Board board = new Board(20, 10);

       /* for (int col = 0; col <= 8; col += 2) {
            PieceSquare square = new PieceSquare();
            board.setPiezaActual(square.forma(), 18, col);
            while (board.moveDown()) {}
        } */

        // 5 cuadrados para las 10 columnas
        PieceSquare square1 = new PieceSquare();
        board.setPiezaActual(square1.forma(), 0, 0);
        while (board.moveDown()) {}

        PieceSquare square2 = new PieceSquare();
        board.setPiezaActual(square2.forma(), 0, 2);
        while (board.moveDown()) {}

        PieceSquare square3 = new PieceSquare();
        board.setPiezaActual(square3.forma(), 0, 4);
        while (board.moveDown()) {}

        PieceSquare square4 = new PieceSquare();
        board.setPiezaActual(square4.forma(), 0, 6);
        while (board.moveDown()) {}

        PieceSquare square5 = new PieceSquare();
        board.setPiezaActual(square5.forma(), 0, 8);
        while (board.moveDown()) {}



        assertEquals(1, board.getCelda(19, 0), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 2), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 4), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 6), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 8), "La fila 19 debe estar completa");

        board.EliminarFila();

        for(int j = 0; j < 10; j++){
            assertEquals(0, board.getCelda(19, j), "La fila 19 debe estar vacía");
        }

    }
}