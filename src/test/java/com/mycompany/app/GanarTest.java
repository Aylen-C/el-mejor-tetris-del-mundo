package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GanarTest {

    @Test
    public void ganarPartida(){
        Board board = new Board(20, 10);
        int lineasGanadoras = 3;       
         

        // FILA 19 Y 18
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


        // FILA 17 Y 16
        PieceSquare square6 = new PieceSquare();
        board.setPiezaActual(square6.forma(), 0, 0);
        while (board.moveDown()) {}

        PieceSquare square7 = new PieceSquare();
        board.setPiezaActual(square7.forma(), 0, 2);
        while (board.moveDown()) {}

        PieceSquare square8 = new PieceSquare();
        board.setPiezaActual(square8.forma(), 0, 4);
        while (board.moveDown()) {}

        PieceSquare square9 = new PieceSquare();
        board.setPiezaActual(square9.forma(), 0, 6);
        while (board.moveDown()) {}

        PieceSquare square10 = new PieceSquare();
        board.setPiezaActual(square10.forma(), 0, 8);
        while (board.moveDown()) {}

        
    
        assertEquals(4, board.lineCount());
        assertTrue(board.lineCount(lineasGanadoras), "Se gana al completar " + lineasGanadoras + " lineas");
    }
    
}
