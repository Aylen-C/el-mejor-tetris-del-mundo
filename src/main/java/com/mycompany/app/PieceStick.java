package com.mycompany.app;

public class PieceStick {
    private int[][] cells;

    public PieceStick(int x, int y) {
    cells = new int [][] {
        {x, y},
        {x, y + 1},
        {x, y + 2},
        {x, y + 3}
    };
}
public int[][] getCells() {
    return cells;
}
}