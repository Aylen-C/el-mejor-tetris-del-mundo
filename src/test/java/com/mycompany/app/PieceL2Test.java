package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PieceL2Test {

    @Test
    public void testFormaL2Normal() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(0);
        String[][] esperado = {
            {".", ".", "*"},
            {".", ".", "*"},
            {".", "*", "*"}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaL2RotadaDerecha() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(1);
        String[][] esperado = {
            {".", ".", "."},
            {"*", "*", "*"},
            {".", ".", "*"}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void testFormaL2RotadaAbajo() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(2);
        String[][] esperado = {
            {"*", "*", "."},
            {"*", ".", "."},
            {"*", ".", "."}
        };
        String[][] resultado = pieza.forma();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                assertEquals(esperado[i][j], resultado[i][j]);
    }

    @Test
    public void noPuedeDescenderCuandoHayObstaculo() {
        PieceL2 pieza = new PieceL2();
        pieza.setPosicionActual(0);
        String[][] tablero = {
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {"*", "*", "*", "*", "*"},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."}
        };
        boolean puedeBajar = pieza.puedeDescender(tablero, 1, 2);
        assertEquals(false, puedeBajar);
    }

@Test
public void noPuedeRotarSiChocaConOtraPieza() {
    PieceL2 pieza = new PieceL2();
    pieza.setPosicionActual(0);
    String[][] tablero = {
        {".", ".", ".", ".", "."},
        {".", ".", ".", ".", "."},
        {".", ".", ".", "*", "."}, 
        {".", ".", ".", ".", "."},
        {".", ".", ".", ".", "."}
    };
    boolean puedeRotar = pieza.puedeRotar(tablero, 1, 2);
    assertEquals(false, puedeRotar);
}
}