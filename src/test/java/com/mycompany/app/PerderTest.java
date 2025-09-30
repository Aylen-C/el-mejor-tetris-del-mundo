package com.mycompany.app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerderTest {

  @Test
  public void perderPartida(){
    Board board = new Board(20, 10);
    Clock clock = new Clock();
    PieceSquare square = new PieceSquare();

    boolean perder = false; 

    for (int caidas=0; caidas<11; caidas++){
      board.setPiezaActual(square.forma(), 0,5);
      while (true) {
         if (clock.tick()) { // si el reloj indica que es tiempo de bajar la pieza
            if (!board.moveDown()) {
              perder = true;
              break; // la pieza no puede bajar más, salir del bucle
            }
          }
        }
        if(perder)
          break;
      }
      assertTrue(perder, "Perdio la partida");
    }
    

  


  @Test
  public void noPuedeIngresarPieza(){
    Board board = new Board(20, 10);
    PieceSquare square = new PieceSquare();
    Clock clock = new Clock();

    for (int caidas=0; caidas<11; caidas++){
      board.setPiezaActual(square.forma(), 0,5); 

      boolean puedeIngresar = true;
      while (true) {
        if (clock.tick()) { // si el reloj indica que es tiempo de bajar la pieza
          puedeIngresar = board.moveDown();
          if (!puedeIngresar) {
            break; // la pieza no puede bajar más, salir del bucle
          }
        }
      }
    }

      boolean pudoColocar = board.intentaColocar(square.forma(), -1, 5);
      // Verificar que no se pudo ingresar la pieza
      assertFalse(pudoColocar, "No se puede ingresar la pieza, no hay mas lugar.");
      
    }
}

    

