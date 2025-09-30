package com.mycompany.app;

public class Clock {
    private int tick;
    private int tickContador;  

    public Clock() {
        this.tick = 2;
        this.tickContador = 0;
    }

    public boolean tick() {
        tickContador++;
        if (tickContador == tick) {  //Cuando llega a 2 (tickContador == tick), lo reseteás a 0 y devolvés true.
            tickContador = 0;
            return true;
        }
        return false;
    }
    
    public boolean tick(Board board){
        if (tick()){   // llama a tick
            return board.moveDown(); // si puede bajar la pieza devuelve true, si no false
        }
        return true; // si no es tiempo de bajar devuelve true para que el juego siga
    }
}