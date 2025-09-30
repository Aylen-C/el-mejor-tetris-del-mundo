package com.mycompany.app;

public class PieceL2 extends PieceBase {
    @Override
    public void rotateRight() {
        setPosicionActual(getPosicionActual() + 1);
        if (getPosicionActual() > 3) {
            setPosicionActual(0);
        }
    }

    @Override
    public void rotateLeft() {
        setPosicionActual(getPosicionActual() - 1);
        if (getPosicionActual() < 0) {
            setPosicionActual(3);
        }
    }

    @Override
    public int[][] forma() {
        switch (getPosicionActual()) {
            case 0:
                return new int[][] {
                    {0,2},
                    {1,2},
                    {2,1}, {2,2}
                };
            case 1:
                return new int[][] {
                    {1,0}, {1,1}, {1,2},
                    {2,2}
                };
        }
        return null;
    }
}