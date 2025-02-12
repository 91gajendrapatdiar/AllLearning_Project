package org.springseteroType.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("SeterotypeAnnotation.xml");



        /// here we are using the Annotation to define the scope in the Pojo class
        // without uding the xml class
        // @Compoent
        // @Scope("prototype")
        // singleton is by default int the IOC


        System.out.println(" Implementing the Bean scope using the Annotation ");
        Student st1 = (Student) context.getBean("student", Student.class);
        System.out.println(st1);
        System.out.println(" It is create a object of the Student class and give a hashCode" +st1.hashCode());
        Student st2 = (Student) context.getBean("student", Student.class);
        System.out.println(" IOC creatting run again but it give the same " +
                " regerence of the hashCode .Means it doesn't create a object again"+st2.hashCode());


// implementation of the bean scope using the xml file
        // < bean class =" "  name =" "   scope = " " >
        //  <property/></bena>
        //Singleton
        //prototype
        // session
        // request
        //golbalession


        BeanScopeUsingXml xml1 = (BeanScopeUsingXml) context.getBean("name");
        System.out.println(" Bean Scope Usign the xml  file in which we using the " +
                "scope keyword inside the bean tag");
        System.out.println(xml1);
        System.out.println(xml1.hashCode());


        BeanScopeUsingXml xml2 = (BeanScopeUsingXml) context.getBean("name");
        System.out.println("  Again running the class or it creating the object again ");
        System.out.println(xml2);
        System.out.println(xml2.hashCode());
    }
}
