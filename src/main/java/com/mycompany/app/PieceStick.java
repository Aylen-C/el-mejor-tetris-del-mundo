package com.mycompany.app;

public class PieceStick {
    private int[][] cells;
    private boolean vertical; // Nueva variable

    public PieceStick(int x, int y) {
        cells = new int [][] {
            {x, y},
            {x, y + 1},
            {x, y + 2},
            {x, y + 3}
        };
        vertical = true; // Inicialmente vertical
    }

    public void rotateRight () {
        rotate();
    }

    public void rotateLeft () {
        rotate();
    }

    private void rotate() {
        int x = cells[0][0];
        int y = cells[0][1];
        if (vertical()) {
            cells = new int [][] {
                {x, y},
                {x + 1, y},
                {x + 2, y},
                {x + 3, y}
            };
        } else {
            cells = new int [][] {
                {x, y},
                {x, y + 1},
                {x, y + 2},
                {x, y + 3}
            };
        }
        vertical = !vertical;
    }

    private boolean vertical() {
        return vertical;
    }

    public int[][] getCells() {
        return cells;
    }
}