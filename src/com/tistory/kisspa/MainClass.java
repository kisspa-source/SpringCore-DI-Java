package com.tistory.kisspa;

import com.tistory.kisspa.comp.SampleComponent;
import com.tistory.kisspa.comp.classical.SampleForClassical;
import com.tistory.kisspa.comp.diforjava.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        classicalStyle();
        //diStyleForJava();
        //diStyleForXML();
        //diStyleForAnnotation();

    }

    /**
     * 고전적인 방식
     */
    private static void classicalStyle() {
        SampleComponent sampleComponent = new SampleForClassical();
        String rtnVal = sampleComponent.saySomething();
        System.out.println(rtnVal);
    }

    /**
     * 자바 기반 설정의 Spring DI
     */
    private static void diStyleForJava() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SampleComponent sampleComponent = (SampleComponent) applicationContext.getBean("sampleForDiJava");

        String rtnVal = sampleComponent.saySomething();
        System.out.println(rtnVal);
    }

    /**
     * XML 기반 설정의 Spring DI
     */
    private static void diStyleForXML() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:/com/tistory/kisspa/comp/diforxml/config/applicationContext.xml");

        SampleComponent sampleComponent = (SampleComponent) applicationContext.getBean("sampleForDiXml");

        String rtnVal = sampleComponent.saySomething();
        System.out.println(rtnVal);
    }

    /**
     * 애너테이션 기반 설정의 Spring DI
     */
    private static void diStyleForAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.tistory.kisspa.comp.diforannotation");

        SampleComponent sampleComponent = (SampleComponent) applicationContext.getBean("sampleForAnnotation");

        String rtnVal = sampleComponent.saySomething();
        System.out.println(rtnVal);

    }
}
