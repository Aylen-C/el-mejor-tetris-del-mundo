package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PieceTest {
  
    @Test
    public void formaNormalT() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1}, {0,2},
                   {1,1}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaT() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(1);
        int[][] esperado = {
                  {0,2},
            {1,1}, {1,2},
                  {2,2}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaAbajoT() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(2);
        int[][] esperado = {
                  {1,1},
            {2,0}, {2,1}, {2,2}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaIzquierdaT() {
        PieceT pieza = new PieceT();
        pieza.setPosicionActual(3);
        int[][] esperado = {
            {0,0},
            {1,0}, {1,1},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

     @Test
    public void formaNormalStick() {
        PieceStick pieza = new PieceStick();
        pieza.setPosicionActual(0); // horizontal
        int[][] esperado = {
            {0,0}, {0,1}, {0,2}, {0,3}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaStick() {
        PieceStick pieza = new PieceStick();
        pieza.setPosicionActual(1); // vertical
        int[][] esperado = {
            {0,0},
            {1,0},
            {2,0},
            {3,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaNormalSquare() {
        PieceSquare pieza = new PieceSquare();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1},
            {1,0}, {1,1}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaSquare() {
        PieceSquare pieza = new PieceSquare();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {0,0}, {0,1},
            {1,0}, {1,1}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaNormalL() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0},
            {1,0},
            {2,0}, {2,1}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaL() {
        PieceL pieza = new PieceL();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {1,0}, {1,1}, {1,2},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaNormalL2() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,2},
            {1,2},
            {2,1}, {2,2}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaL2() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {1,0}, {1,1}, {1,2},
            {2,2}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaNormalDog() {
        PieceDog pieza = new PieceDog();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1},
                   {1,1}, {1,2}    
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaDog() {
        PieceDog pieza = new PieceDog();
        pieza.setPosicionActual(1);
        int[][] esperado = {
            {0,1},
            {1,0}, {1,1},
            {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaNormalDog2() {
        PieceDog2 pieza = new PieceDog2();
        pieza.setPosicionActual(0);
        int[][] esperado = {
            {0,0}, {0,1},
                   {1,1}, {1,2}    
       };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void formaDerechaDog2() {
        PieceDog2 pieza = new PieceDog2();
        pieza.setPosicionActual(1);
        int[][] esperado = {
                {0,1},
        {1,0}, {1,1},
        {2,0}
        };
        int[][] resultado = pieza.forma();
        assertArrayEquals(esperado, resultado);
    }


}

    