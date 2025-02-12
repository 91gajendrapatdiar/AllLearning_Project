package org.example;

import org.example.beans.Student;
import org.example.context.ContextProvider;
import org.example.dao.StudentDao;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao studentDao=ctx.getBean("stDao", StudentDao.class);

//        // insert
//        Student s=new Student(101,"Nisha");
//        studentDao.insert(s);
        // getting the data
        Student s=studentDao.getStudent(101);
        System.out.println(s);
    }
}
