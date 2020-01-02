package com.tistory.kisspa.comp.classical.util;

import java.util.Random;

public class Lotto645 {
    private int[] randoInts = new int[6];
    private Random random = new Random();

    public int[] getRandomValue() {

        for (int i = 0; i < 6; i++) {
            randoInts[i] = random.nextInt(45)+1;
        }

        return randoInts;
    }

}
