package com.example.demo.enumexample;

public class EnumTest2 {
    public static void main(String[] args) {
        for(Direction d : Direction.values()){
            System.out.printf("%s=%d%n",d.name(),d.ordinal());
        }
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);

        System.out.printf("%s=%d%n",d1.name(),d1.ordinal());
        System.out.printf("%s=%d%n",d2.name(),d2.ordinal());
        System.out.println("--------------------------------");
        System.out.println(Direction.WEST.rotate(2));
        System.out.println(Direction.NORTH.rotate(3));
        System.out.println(Direction.WEST.rotate(-2));

    }
}
