package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;;

public class ClockTest {

   @Test
    public void Baja2Filas(){
    Board board = new Board(20, 10);
    Clock clock = new Clock();
    PieceSquare square = new PieceSquare();
    board.setPiezaActual(square.forma(), 0,0);// Coloca la pieza en la parte superior del tablero


    int bajadas=0; 

    for(int tick=0; tick<4; tick++){
        if (clock.tick()){
        boolean puedebajar = board.moveDown();
        assertTrue(puedebajar,"Puede seguir bajando");
        bajadas++;

        }
    }

    assertEquals(2,bajadas);
    
}


@Test
public void BajaCompleto(){
    Board board = new Board(20, 10);
    Clock clock = new Clock();
    PieceSquare square = new PieceSquare();
    board.setPiezaActual(square.forma(), 0,0);

    int bajadas=0; 
    boolean puedebajar=true;

    for(int tick=0; tick<38; tick++){
        if (clock.tick()){
        puedebajar = board.moveDown();
        }
        if (!puedebajar){
            break;
        }
        bajadas++;
    };
    assertEquals(37,bajadas, "bajó 19 veces");
    assertFalse(puedebajar,"No puede seguir bajando");
    


    
}
}
