package com.example.demo.enumexample;

public class EnumTest {
    public static void main(String[] args) {
        Direction[] dArr = Direction.values();

        for(Direction d : dArr){
            System.out.printf("%s = %d%n",d.name(), d.ordinal());
        }

        //참조를 얻을 수 있다.
        Direction d = Direction.valueOf("WEST");
        System.out.println(d == Direction.WEST);

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println(d1.equals(d3)); // true
        System.out.println(d1 == d3); // true
    }
}
