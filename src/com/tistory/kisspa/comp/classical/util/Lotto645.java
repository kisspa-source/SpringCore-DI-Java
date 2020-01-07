package com.tistory.kisspa.comp.classical.util;

import java.util.Arrays;
import java.util.Random;

public class Lotto645 {
    private int[] randoInts = new int[6];
    private int[] lottoNumber = new int[7];
    private int randomInt;
    private int bountInt;
    private Random random = new Random();

    public int[] getLottoNumber() {
        for (int i = 0; i < 6; i++) {
            randomInt = getRandomInt(45);
            while (checkDuplication(randomInt, randoInts)) {
                randomInt = getRandomInt(45);
            }
            randoInts[i] = randomInt;
        }
        Arrays.sort(randoInts);

        // 보너스 숫자
        for (int i = 0; i < randoInts.length; i++) {
            lottoNumber[i] = randoInts[i];
        }

        bountInt = getRandomInt(45);
        while(checkDuplication(bountInt, randoInts)) {
            bountInt = getRandomInt(45);
        }

        System.out.println("Bonus Number : "+bountInt);
        lottoNumber[6] = bountInt;

        return lottoNumber;
    }

    /**
     * 중복 체크
     * 중복이면 true 리턴
     * @param number
     * @return
     */
    private boolean checkDuplication(int number, int[] numberArray) {
        boolean isDuplication = false;
        for (int i = 0; i < numberArray.length; i++) {
            if (number == numberArray[i]) {
                System.out.println(number+" == "+numberArray[i]);
                isDuplication = true;
                break;
            }
        }
        return isDuplication;
    }

    /**
     * 랜덤숫자 bound+1
     * @param bound
     * @return
     */
    private int getRandomInt(int bound) {
        return random.nextInt(bound)+1;
    }

}
