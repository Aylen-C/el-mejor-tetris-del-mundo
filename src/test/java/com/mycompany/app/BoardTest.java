package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class BoardTest {

@Test   
   public void CreaTablero () {
      Board board = new Board(20, 10);
      for (int i = 0; i < 20; i++) {
         for (int j = 0; j < 10; j++) {
            assertEquals(0, board.getCelda(i, j));
         }
      }
   }



      @Test
      public void PiezasTablero() {
         Board board = new Board(20,10); 

         PieceSquare pieceSquare = new PieceSquare();
         assertTrue(board.Colocar(pieceSquare.forma()), "La pieza está dentro del tablero");

         assertEquals(0, board.getCelda(19,3));
         assertEquals(0, board.getCelda(19,4));
         assertEquals(0, board.getCelda(18,3));
         assertEquals(0, board.getCelda(18,4));

         PieceStick pieceStick = new PieceStick();
         assertTrue(board.Colocar(pieceStick.forma()), "La pieza está dentro del tablero");

         assertEquals(0, board.getCelda(19,6));
         assertEquals(0, board.getCelda(18,6));
         assertEquals(0, board.getCelda(17,6));
         assertEquals(0, board.getCelda(16,6));
      }


   @Test
   public void FueraDelTablero() {
      Board board = new Board(20, 10);
      PieceSquare pieceSquareAfuera = new PieceSquare();
      assertTrue(board.Colocar(pieceSquareAfuera.forma()), "La pieza está fuera del tablero");

     PieceStick pieceStickAfuera = new PieceStick();
      assertTrue(board.Colocar(pieceStickAfuera.forma()), "La pieza está fuera del tablero");
   }



   @Test
   public void CaidaLibreSquare(){

      Board board = new Board(20, 10);
      PieceSquare square = new PieceSquare();

      board.setPiezaActual(square.forma(), 0,0);

      while (board.moveDown()) {
      }

      for (int i = 0; i < 20; i++) {   // recorre filas y columnas
         for (int j = 0; j < 10; j++) {
            if ((i == 18 || i == 19) && (j == 0 || j == 1)) {
               assertEquals(1, board.getCelda(i, j)); //si la celda esta ocupada da 1
            }
            else{
               assertEquals(0, board.getCelda(i, j)); // si esta vacia da 0
            }
         }
      }
   }



   @Test
   public void CaidaLibreStickVertical(){

      Board board = new Board(20, 10);
      PieceStick stick = new PieceStick();

      stick.rotateRight(); // pone la pieza en vertical

      board.setPiezaActual(stick.forma(), 0,0);

      while (board.moveDown()) {
      }

      for (int i = 0; i < 20; i++) {   // recorre filas y columnas
         for (int j = 0; j < 10; j++) {
            if ((i >= 16 && i <= 19) && (j == 0)) {
               assertEquals(1, board.getCelda(i, j)); //si la celda esta ocupada da 1
            }
            else{
               assertEquals(0, board.getCelda(i, j)); // si esta vacia da 0
            }
         }
      }
   }

   @Test
   public void CaidaLibreStickHorizontal(){

      Board board = new Board(20, 10);
      PieceStick stick = new PieceStick();
      // la pieza por default esta horizontal

      board.setPiezaActual(stick.forma(), 0,0);

      while (board.moveDown()) {
      }

      for (int i = 0; i < 20; i++) {   // recorre filas (i) y columnas (j)
         for (int j = 0; j < 10; j++) {
            if ((i == 19) && (j >= 0 && j <= 3)) {
               assertEquals(1, board.getCelda(i, j)); //si la celda esta ocupada da 1
            }
            else{
               assertEquals(0, board.getCelda(i, j)); // si esta vacia da 0
            }
         }
      }
   }


   @Test
   public void BoardClock(){

      Board board = new Board(20, 10);
      Clock clock = new Clock();
      PieceSquare square = new PieceSquare();

      board.setPiezaActual(square.forma(), 0,1); // activo la pieza antes de dejarla caer

      while (true) {
        if (clock.tick()) { // si el reloj indica que es tiempo de bajar la pieza
            boolean puedeBajar = board.moveDown();
            if (!puedeBajar) {
                break; // la pieza no puede bajar más, salir del bucle
            }
        }
    }

         // Verificar que la pieza ha bajado correctamente
      for (int filas = 0; filas < 20; filas++) {
         for (int columnas = 0; columnas < 10; columnas++) {
            if ((filas == 18 || filas == 19) && (columnas == 1 || columnas == 2)) {
               assertEquals(1, board.getCelda(filas, columnas)); 
               // la pieza llegó al fondo
            }
            else{
               assertEquals(0, board.getCelda(filas, columnas)); // las demás celdas están vacías
            }
         }
      }
   }


   @Test
   public void ColisionTest (){
      Board board = new Board (20, 10);

      PieceSquare square = new PieceSquare();
      board.setPiezaActual(square.forma(), 0, 4); // ahora se pone coordenadas iniciales
      while (board.moveDown()) {
      }

      PieceStick stick = new PieceStick();
      board.setPiezaActual(stick.forma(), 0, 4); // ahora se pone coordenadas iniciales
      while (board.moveDown()) {
      }

      for (int i = 18; i <= 19; i++) { // square tiene que estar en el fondo en filas 18 y 19
         for (int j = 4; j <= 5; j++) { // columnas 0 y 1
            assertEquals(1, board.getCelda(i, j)); // confirma posicion
         }
      }

      for (int j = 4; j <= 5; j++) { // stick tiene que estar justo arriba del square
         assertEquals(1, board.getCelda(17, j)); //fila 17 y columnas 4 a 5
      }

   }
}

