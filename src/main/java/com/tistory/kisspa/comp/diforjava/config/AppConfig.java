package com.tistory.kisspa.comp.diforjava.config;

import com.tistory.kisspa.comp.diforjava.SampleForDiJava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tistory.kisspa.comp.diforjava")
public class AppConfig {

    @Bean
    SampleForDiJava sampleForDiJava() {
        return new SampleForDiJava();
    }
}
