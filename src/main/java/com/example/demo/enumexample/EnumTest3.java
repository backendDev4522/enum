package com.example.demo.enumexample;

public class EnumTest3 {
    public static void main(String[] args) {
        System.out.println("bus fare="+Transportation.BUS.fare(100));
        System.out.println("bus fare="+Transportation.TRAIN.fare(100));
        System.out.println("bus fare="+Transportation.SHIP.fare(100));
        System.out.println("bus fare="+Transportation.AIRPLANE.fare(100));
    }
}
