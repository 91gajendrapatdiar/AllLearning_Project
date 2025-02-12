package org.RemovingXMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoMainn {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student st1 = (Student) context.getBean( "student" ,Student.class);
        System.out.println(st1);
        st1.study();
    }
}
