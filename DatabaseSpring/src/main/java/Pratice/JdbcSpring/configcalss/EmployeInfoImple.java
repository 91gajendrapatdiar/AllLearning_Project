package Pratice.JdbcSpring.configcalss;

import org.example.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
public class EmployeInfoImple  implements  EmployeInfo {


    private JdbcTemplate jdbcTemplate;

    @Override
    public int  insert(Employee employe1) {
        String sql = "insert into Emp(id, name , designation, salary) values(?,?,?,?)";
                int r = this.jdbcTemplate.update( sql,employe1.getId(),employe1.getName(), employe1.getDesignation(),employe1.getSalary());
        return r;
    }



    @Override
    public int changes(Employee employe2) {
        String sql = "update Emp set name =? , designation=? , salary=? where id=?";
        int r = this.jdbcTemplate.update(sql,employe2.getName(), employe2.getDesignation(),employe2.getSalary(),employe2.getId());
        return r;
    }

    @Override
    public int delete(int employeId) {
        String sql = " delete from Emp where id=?";

        int r = this.jdbcTemplate.update(sql, employeId);
        return r;

    }

    @Override
    public  Employee getsingleData(int employeId) {
        String sql = "select *from Emp where id =?";
        // RowMapper is java predefine class and RoMapperImeplemation is
        // Implementation class of the Rowmapper
        RowMapper<Employee> row = new RoMapperImplematation();
        Employee employee = this.jdbcTemplate.queryForObject(sql, row, employeId);
        return employee;

    }

    @Override
    public List<Employee> getAllData() {
         String sql = "Select *from Emp";
         List<Employee>  s=  this.jdbcTemplate.query(sql,new RoMapperImplematation());
         return s;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
