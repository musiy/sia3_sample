package com.musiy;

import com.musiy.comps.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer duke = ctx.getBean("duke", Performer.class);
        duke.perform();
        System.out.println("----------------------------------------");

        Performer poeticDuke = ctx.getBean("poeticDuke", Performer.class);
        poeticDuke.perform();
    }
}
