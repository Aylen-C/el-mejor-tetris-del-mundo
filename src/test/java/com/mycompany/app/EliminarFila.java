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


/* 
                    L H
                    L H
    x x - - - - O O L H   <- FILA 18
      x x       O O L H
*/

    @Test
    public void EliminarLineaCompletaConDistintasPiezas() {
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
        PieceStick stickHorizontal = new PieceStick(); 
        stickHorizontal.setPosicionActual(0);// posición horizontal
        board.setPiezaActual(stickHorizontal.forma(), 0, 2);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 2), "Ocupa (fila 18, columna 2)");
        assertEquals(1, board.getCelda(18, 3), "Ocupa (fila 18, columna 3)");
        assertEquals(1, board.getCelda(18, 4), "Ocupa (fila 18, columna 4)");
        assertEquals(1, board.getCelda(18, 5), "Ocupa (fila 18, columna 5)");



        // Square comenzando en columna 6
        PieceSquare square = new PieceSquare();
        board.setPiezaActual(square.forma(), 0, 6);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 6), "Ocupa (fila 18, columna 6)");
        assertEquals(1, board.getCelda(18, 7), "Ocupa (fila 18, columna 7)");
        assertEquals(1, board.getCelda(19, 6), "Ocupa (fila 19, columna 6)");
        assertEquals(1, board.getCelda(19, 7), "Ocupa (fila 19, columna 7)");



        // Stick vertical en columna 8
        PieceStick stick1 = new PieceStick();
        stick1.setPosicionActual(1);// posición vertical
        board.setPiezaActual(stick1.forma(), 0, 8);
        while (board.moveDown()) {}

        assertEquals(1, board.getCelda(18, 8), "Ocupa (18,8)");
        assertEquals(1, board.getCelda(19, 8), "Ocupa (19,8)");

        
        // Stick vertical en columna 9
        PieceStick stick2 = new PieceStick();
        stick2.setPosicionActual(1); // posición vertical
        board.setPiezaActual(stick2.forma(), 0, 9);
        while (board.moveDown()) {}
        
        assertEquals(1, board.getCelda(18, 9), "Ocupa (fila 18, columna 9)");
        assertEquals(1, board.getCelda(19, 9), "Ocupa (fila 19, columna 9)");

     
        board.EliminarFila();
    

        assertEquals(0, board.getCelda(18, 0), "La fila 18 debe estar vacía en la columna 0");
        assertEquals(0, board.getCelda(18, 1), "La fila 18 debe estar vacía en la columna 1");
        assertEquals(0, board.getCelda(18, 2), "La fila 18 debe estar vacía en la columna 2");
        assertEquals(0, board.getCelda(18, 3), "La fila 18 debe estar vacía en la columna 3");
        assertEquals(0, board.getCelda(18, 4), "La fila 18 debe estar vacía en la columna 4");
        assertEquals(0, board.getCelda(18, 5), "La fila 18 debe estar vacía en la columna 5");
        assertEquals(0, board.getCelda(18, 6), "La fila 18 debe estar vacía en la columna 6");
        assertEquals(0, board.getCelda(18, 7), "La fila 18 debe estar vacía en la columna 7");
        
        
        assertEquals(1, board.getCelda(18, 8), "La fila 18 debe estar ocupada en la columna 8");
        assertEquals(1, board.getCelda(18, 9), "La fila 18 debe estar ocupada en la columna 9");
    }
}
