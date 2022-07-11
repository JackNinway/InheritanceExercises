package org.example;

import java.util.Random;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    Random random = new Random();
    private int value;

    private Dice(int n){
        value = n;
    }
    public int roll(int max){
        return random.nextInt(max)+1;

    }
    public int getValue(){
        return value;
    }

}
