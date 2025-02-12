package org.AtuoWirting.UsingTheXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("atuowiring.xml");
        Employee em = (Employee) context.getBean("emp1");
        System.out.println(em);
    }
}
