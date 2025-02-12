package org.AtuoWirting.AnnotationAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAuto {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "AnnotationAtuowiring.xml ");
        Person p1 = (Person)  context.getBean("per1");
        System.out.println(p1);
    }
}
