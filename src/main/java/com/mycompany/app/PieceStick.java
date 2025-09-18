package com.mycompany.app;

public class PieceStick extends Piece {


@Override
public String[][] forma() {
    switch (posicionActual) {
        case 0: //stick vertical
        return new String[][] {
            {"*"},
            {"*"},
            {"*"},
            {"*"}
        };
        case 1: //stick horizontal
        return new String[][] {
            {"*", "*", "*", "*"}
        };
    }
    return null;
}
}
