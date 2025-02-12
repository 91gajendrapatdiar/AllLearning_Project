package org.example;

import org.example.Entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.applet.Applet;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(" my program started.....................");
        // spring jdbc ==> jdbcc template

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         Studentdao studentdao = context.getBean("studentDao", Studentdao.class);



         // take the information from the user



//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the  information of the student ");
//        int id = obj.nextInt();
//        String name = obj.next();
//        String  city = obj.next();


        // isnerting the inforamtion in the mysql database


//        Student student = new Student();
//        student.setId(id);
//        student.setName(name);
//        student.setCity(city);
//
//        int res = studentdao.inserte(student);
//        System.out.println("student added" + res);





        /// updating the data int he sql database

//        Student student = new Student();
//        student.setId(id);
//        student.setName(name);
//        student.setCity(city);
//
//        int re = studentdao.change(student);
//        System.out.println(" Data Update:" +re);




        // deleting the data from the mysql workbbench

//        int re = studentdao.deletes(899);
//        System.out.println(" delete records" + re);





        // using the selecting the singal data to seletcing the data from the sql
//        Student student = studentdao.getStudent(id);
//        System.out.println(student);




        // multiple data we are getting here

        List<Student> students= studentdao.getMultiPle();
        for(Student s: students){
            System.out.println(s);
        }

    }
}
