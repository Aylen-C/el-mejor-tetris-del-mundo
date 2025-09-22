package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;;

public class ClockTest {

   @Test
    public void BajaCompleto(){
    Board board = new Board(20, 10);
    Clock clock = new Clock();
    PieceSquare square = new PieceSquare();
    board.setPiece(square, 0, 4); // Coloca la pieza en la parte superior del tablero

    for(int tick=0; tick<4; tick++){
        boolean puedebajar = board.moveDown();
        assertEquals(true, puedebajar);


    }



    
}
}
