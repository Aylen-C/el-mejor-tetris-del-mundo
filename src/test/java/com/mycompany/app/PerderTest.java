package com.mycompany.app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;;

public class PerderTest {

    @Test
    public void perderPartida(){
    Board board = new Board(20, 10);
    Clock clock = new Clock();
    PieceSquare square = new PieceSquare();

    boolean perder = false; 

    for (int caidas=0; caidas<11; caidas++){
      board.setPiezaActual(square.forma(), 0,5);

        boolean moverPieza = board.moveDown(); //intenta bajar la pieza actual una fila
        perder = true; 
        break; 
      }
     while (true) {
        if (clock.tick()) { // si el reloj indica que es tiempo de bajar la pieza
            boolean puedeBajar = board.moveDown();
            if (!puedeBajar) {
                perder= true;
                break; // la pieza no puede bajar más, salir del bucle
            }
        }
       }
      }
        assertTrue(perder, "Perdio la partida");
    }

    }
    

