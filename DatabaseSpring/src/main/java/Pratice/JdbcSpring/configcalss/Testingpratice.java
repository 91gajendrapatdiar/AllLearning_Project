package Pratice.JdbcSpring.configcalss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class Testingpratice {
    public static void main(String[] args) {

        System.out.println(" MY Application is showing the working of the SpringJDBC");


//        //Configuration with using XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("PracticeJdbcc.xml");


  // Without using the Xml fil
        ApplicationContext context  = new AnnotationConfigApplicationContext(javaConfig.class);


        /// employeInfo is  parent class of the employeInfoImple
        EmployeInfo employeInfo = context.getBean("Employeinfo" , EmployeInfo.class);



        // tthis willl use when we will not using the interface
        //    JdbcTemplate Template =  context.getBean("jdbcTem",JdbcTemplate.class);




//
//        String sql1 = "Insert into Emp(id,name, designation, salary)  values(? ,? ,?,?)";
//        // inserting the value in the table
//        int r = Template.update(sql1, 2, "Dheeraj", "Doctor", 786879);
//        System.out.println(" record inserted " + r);


//        // insertion operation using the xml

        Employee employee = new Employee();
        employee.setId(89);
        employee.setName("Riyansh");
        employee.setDesignation("Team Member");
        employee.setSalary(898978089);

        int r = employeInfo.insert(employee);
        System.out.println(" Enter the record" + r);



//        Employee employee = new Employee();
//        employee.setId(52);
//        employee.setName("Vijay");
//        employee.setDesignation(" Manager");
//        employee.setSalary(79888);
//
//        int r = employeInfo.changes(employee);
//        System.out.println("Update data" +r);



        /// delete the data

//        Scanner obj = new Scanner(System.in);
//        int id = obj.nextInt();


//        int r = employeInfo.delete(id);
//        System.out.println(" deleted data"+r);


        // get a single data
//        Employee r = employeInfo.getsingleData(id);
//        System.out.println("user data" +r);


//        // getting all data which is present in the database
//        System.out.println("all the records");
//        List<Employee> employees= employeInfo.getAllData();
//        for(Employee e: employees){
//            System.out.println(e);
        }

    }