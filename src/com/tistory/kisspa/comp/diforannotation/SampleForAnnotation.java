package com.tistory.kisspa.comp.diforannotation;

import com.tistory.kisspa.comp.SampleComponent;
import org.springframework.stereotype.Component;

@Component
public class SampleForAnnotation implements SampleComponent {
    @Override
    public String saySomething() {
        return "hello, i'm SampleComponent DI Annotation";
    }
}
