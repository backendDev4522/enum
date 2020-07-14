package com.example.demo.enumexample;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public enum  Transportation {
    BUS(100){ int fare(int distance){ return distance*BASIC_FARE;} },
    TRAIN(100){ int fare(int distance){ return distance*10*BASIC_FARE;} },
    SHIP(100){ int fare(int distance){ return distance*8*BASIC_FARE;} },
    AIRPLANE(100){ int fare(int distance){ return distance*9*BASIC_FARE;} };

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    private Transportation(int basicFare){
        BASIC_FARE = basicFare;
    }

    int getBasicFare(){
        return BASIC_FARE;
    }
}

