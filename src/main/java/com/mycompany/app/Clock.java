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
    
    
}