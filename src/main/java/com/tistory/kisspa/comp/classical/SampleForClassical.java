package com.tistory.kisspa.comp.classical;

import com.tistory.kisspa.comp.SampleComponent;
import com.tistory.kisspa.comp.classical.util.Lotto645;

import java.util.Arrays;

public class SampleForClassical implements SampleComponent {

    Lotto645 lotto645;
    @Override
    public String saySomething() {
        lotto645 = new Lotto645();

        int[] lottoNumber = lotto645.getLottoNumber();
        return "hello, i'm SampleComponent Classical "+ Arrays.toString(lottoNumber);
    }
}
