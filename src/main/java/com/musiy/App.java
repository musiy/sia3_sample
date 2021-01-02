package com.musiy;

import com.musiy.comps.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer duke = context.getBean("duke", Performer.class);
        duke.perform();
    }
}
