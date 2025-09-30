package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TetrisTest {

    @Test
    public void SuperTetris() {
        Tetris juego = new Tetris(20, 10);

            assertEquals("El juego no ha comenzado", juego.state(), "Antes de start() no tiene que haber ninguna pieza");
        juego.start();
        assertEquals("Hay una pieza en el tablero, las líneas completadas son: 0", juego.state(), "Despues de start() tiene que haber una pieza y 0 líneas");

        Board board = new Board(20, 10);
        Clock clock = new Clock(); // crear un reloj para controlar las caídas


        // rota stick y mueve a la izquierda
        PieceStick stick = new PieceStick();
        stick.rotateRight(); // forma derecha
        board.setPiezaActual(stick.forma(), 0, 5);
        for (int i = 0; i < 5; i++) board.moveLeft(); // empuja al borde
        while (clock.tick(board)) {} // deja caer

        assertEquals(1, board.getCelda(19,0));



        // rota stick horizontal y mueve a la izquierda
        PieceStick stick2 = new PieceStick();
        board.setPiezaActual(stick2.forma(), 0, 5);
        for (int i = 0; i < 4; i++) board.moveLeft(); // empuja al borde
        while (clock.tick(board)) {} // deja caer

        assertEquals(1, board.getCelda(19,1));
        assertEquals(1, board.getCelda(19,2));
        assertEquals(1, board.getCelda(19,3));
        assertEquals(1, board.getCelda(19,4));



        PieceSquare square = new PieceSquare();
        board.setPiezaActual(square.forma(), 0, 5);
        while (clock.tick(board)) {} // deja caer

        assertEquals(1, board.getCelda(19,5));
        assertEquals(1, board.getCelda(19,6));



        // rota L y mueve a la izquierda
        PieceL l = new PieceL();
        board.setPiezaActual(l.forma(), 0, 5);
        board.moveRight();
        board.moveRight();
        while (clock.tick(board)) {} // deja caer

        assertEquals(1, board.getCelda(19,7));
        assertEquals(1, board.getCelda(19,8));


        int antesDeEliminarLineas = board.lineCount(); // ver cuantas lineas se van a eliminar


        PieceStick stick3 = new PieceStick();
        stick3.rotateRight();      // vertical
        board.setPiezaActual(stick3.forma(), 0, 5);
        for (int i = 0; i < 4; i++) board.moveRight(); // empujar a la derecha
        while (clock.tick(board)) {} // deja caer

        assertEquals(1, board.getCelda(19, 9));


        // estado de las celdas
        assertEquals(1, board.getCelda(19,0));

        assertEquals(0, board.getCelda(19,1)); // se elimino stick horizontal
        assertEquals(0, board.getCelda(19,2));
        assertEquals(0, board.getCelda(19,3));
        assertEquals(0, board.getCelda(19,4));

        assertEquals(1, board.getCelda(19,5));
        assertEquals(1, board.getCelda(19,6));
        assertEquals(1, board.getCelda(19,7));

        assertEquals(0, board.getCelda(19,8)); // se elimino pieza de L

        assertEquals(1, board.getCelda(19,9));



        assertEquals(antesDeEliminarLineas + 1, board.lineCount(), "Se elimino 1 fila al colocar la última pieza");
    }
}
