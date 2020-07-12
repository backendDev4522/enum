package com.example.demo.enumexample;

public class Unit {
    int x,y;
    Direction dir;

    public void init(){
        dir = Direction.EAST;
    }

    public void move(){
        switch(dir){
            case EAST: x++; break;
            case WEST: x--; break;
            case NORTH: y++; break;
            case SOUTH: y--; break;
            default: break;
        }
    }
}
