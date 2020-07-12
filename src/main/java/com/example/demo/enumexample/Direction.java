package com.example.demo.enumexample;

public enum Direction {
    EAST(1,">"), SOUTH(2,"V"), WEST(3,">"), NORTH(4,"^");


    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;

    /* 열거형의 생성자는 묵시적으로 private
       new Direction(1); 과 같은 코드 불가능
       컴파일 시에 모든 값을 알고 있어야함.
       컴파일러가 생성자를 실행해주는 것일까??
       그 때 EAST(*, "*") 괄호 안의 부분을 생성자의 매개변수로 넘겨서 enum을 생성해줄까?
       그렇다면 다른 방향, 요소가 생긴다면 생성자를 새로 호출할까?
       enum은 싱글톤인데 어떻게 컴파일될까.
     */
    Direction(int value,String symbol){
        this.value = value;
        this.symbol = symbol;
    }
    public int getValue(){
        return value;
    }

    public String getSymbol(){
        return symbol;
    }

    public static Direction of(int dir){
        if(dir <1 || dir >4){
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir-1];
    }

    public Direction rotate(int num){
        num = num % 4;

        if(num < 0) {
            num += 4;
        }

        return DIR_ARR[(value-1+num) % num];

    }
    public String toString(){
        return name() + getSymbol();
    }
}
