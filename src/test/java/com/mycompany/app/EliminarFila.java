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

        /*
        for (int j = 0; j < 10; j++) {
            assertEquals(1, board.getCelda(19, j), "La fila 19 debe estar completa en la columna " + j);
        }*/

        assertEquals(1, board.getCelda(19, 0), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 2), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 4), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 6), "La fila 19 debe estar completa");
        assertEquals(1, board.getCelda(19, 8), "La fila 19 debe estar completa");

        board.EliminarFila();

        /*
        for (int j = 0; j < 10; j++) {
            assertEquals(1, board.getCelda(19, j), "La fila 19 debe estar completa");
        } 
        */

        assertEquals(0, board.getCelda(19, 0), "La fila 19 debe estar vacía");
        assertEquals(0, board.getCelda(19, 2), "La fila 19 debe estar vacía");
        assertEquals(0, board.getCelda(19, 4), "La fila 19 debe estar vacía");
        assertEquals(0, board.getCelda(19, 6), "La fila 19 debe estar vacía");
        assertEquals(0, board.getCelda(19, 8), "La fila 19 debe estar vacía");

    }



    @Test
    public void EliminarLineaCompletaConPiezasEspecificas() {
        Board board = new Board(20, 10);

        // Dog en columna 0 (sin rotar)
        PieceDog dog = new PieceDog();
        board.setPiezaActual(dog.forma(), 0, 0);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 0), "Dog debe ocupar (18,0)");
        assertEquals(1, board.getCelda(18, 1), "Dog debe ocupar (18,1)");
        assertEquals(1, board.getCelda(19, 1), "Dog debe ocupar (19,1)");
        assertEquals(1, board.getCelda(19, 2), "Dog debe ocupar (19,2)");



        // Stick horizontal comenzando en columna 2
        PieceStick stickH = new PieceStick(); 
        stickH.setPosicionActual(0);// posición horizontal
        board.setPiezaActual(stickH.forma(), 0, 2);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 2), "StickH debe ocupar (18,2)");
        assertEquals(1, board.getCelda(18, 3), "StickH debe ocupar (18,3)");
        assertEquals(1, board.getCelda(18, 4), "StickH debe ocupar (18,4)");
        assertEquals(1, board.getCelda(18, 5), "StickH debe ocupar (18,5)");



        // Square comenzando en columna 6
        PieceSquare square = new PieceSquare();
        board.setPiezaActual(square.forma(), 0, 6);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 6), "Square debe ocupar (18,6)");
        assertEquals(1, board.getCelda(18, 7), "Square debe ocupar (18,7)");
        assertEquals(1, board.getCelda(19, 6), "Square debe ocupar (19,6)");
        assertEquals(1, board.getCelda(19, 7), "Square debe ocupar (19,7)");



        // Stick vertical en columna 8
        PieceStick stickV1 = new PieceStick();
        stickV1.setPosicionActual(1);// posición vertical
        board.setPiezaActual(stickV1.forma(), 0, 8);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 8), "StickV1 debe ocupar (18,8)");
        assertEquals(1, board.getCelda(19, 8), "StickV1 debe ocupar (19,8)");


        
        // Stick vertical en columna 9
        PieceStick stickV2 = new PieceStick();
        stickV2.setPosicionActual(1); // posición vertical
        board.setPiezaActual(stickV2.forma(), 0, 9);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 9), "StickV2 debe ocupar (18,9)");
        assertEquals(1, board.getCelda(19, 9), "StickV2 debe ocupar (19,9)");

     

        board.EliminarFila();
        assertEquals(1, board.lineCount(), "Debe haberse eliminado 1 línea completa");

        assertEquals(0, board.getCelda(18, 0), "La fila 18 debe estar vacía en la columna 0");
        assertEquals(0, board.getCelda(18, 1), "La fila 18 debe estar vacía en la columna 1");
        assertEquals(0, board.getCelda(18, 2), "La fila 18 debe estar vacía en la columna 2");
        assertEquals(0, board.getCelda(18, 3), "La fila 18 debe estar vacía en la columna 3");
        assertEquals(0, board.getCelda(18, 4), "La fila 18 debe estar vacía en la columna 4");
        assertEquals(0, board.getCelda(18, 5), "La fila 18 debe estar vacía en la columna 5");
        assertEquals(0, board.getCelda(18, 6), "La fila 18 debe estar vacía en la columna 6");
        assertEquals(0, board.getCelda(18, 7), "La fila 18 debe estar vacía en la columna 7");
        
        
        assertEquals(1, board.getCelda(18, 8), "La fila 18 debe estar vacía en la columna 8");
        assertEquals(1, board.getCelda(18, 9), "La fila 18 debe estar vacía en la columna 9");
    }
}
