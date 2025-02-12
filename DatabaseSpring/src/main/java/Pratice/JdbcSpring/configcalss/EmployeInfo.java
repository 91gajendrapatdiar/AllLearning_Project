package Pratice.JdbcSpring.configcalss;
import org.springframework.stereotype.Component;

import  java.util.List;


public interface EmployeInfo  {
    public  int insert(Employee employe1);

    public int  changes(Employee employe2);

    public  int  delete(int employeId);

    public Employee getsingleData(int employeId);

    public  List<Employee>  getAllData();

}
