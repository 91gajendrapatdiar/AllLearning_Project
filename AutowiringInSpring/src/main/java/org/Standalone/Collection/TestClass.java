package org.Standalone.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StandaloneCollection.xml");
        Person per1 = (Person) context.getBean("per1");
        System.out.println(per1.toString());
        System.out.println(per1.getFeestructure().getClass().getName());
       Person per2 = (Person) context.getBean("per2");
        System.out.println(per2.toString());

    }
}
