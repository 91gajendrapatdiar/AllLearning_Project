package org.AtuoWirting.QualifierAnnotationAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Qualifierss {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "QualifierAutowiring.xml ");
        Person p1 = (Person)  context.getBean("per1" ,Person.class);
        System.out.println(p1);
    }
}
