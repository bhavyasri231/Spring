package com.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        boolean result = (theCoach==alphaCoach);

        System.out.println("Pointing to the same object: "+ result);

        System.out.println("\nMemory location for theCoach "+ theCoach);

        System.out.println("\nMemory location for theCoach "+ alphaCoach);

        context.close();
    }
}
