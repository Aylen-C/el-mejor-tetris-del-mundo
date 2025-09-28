package com.mycompany.app;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;;
import static org.junit.jupiter.api.Assertions.assertTrue;;

public class GanarTest {

    @Test
    public void ganarPartida(){
        Board board = new Board(20, 10);
        int lineasGanadoras= 3; 

       for(int i=0; i<lineasGanadoras; i++){
         
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
    }

        boolean gano= board.lineCount() >= lineasGanadoras;
        assertTrue(gano, "Se gana al completar " + lineasGanadoras + " lineas");
}
    
}
