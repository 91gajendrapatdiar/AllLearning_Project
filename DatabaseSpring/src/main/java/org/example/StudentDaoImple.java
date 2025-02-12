package org.example;

import org.example.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentdao")
public class StudentDaoImple  implements Studentdao {

@Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int inserte(Student student1) {
        // Insert query
        String sql = "insert into student (id, name, city) values (?, ?, ?)";
     int r =   this.jdbcTemplate.update(sql, student1.getId(), student1.getName(), student1.getCity());
        return r;
    }






    @Override
    public  int change(Student student2) {
        //updating data
        String updatesql = "update student set name=? , city = ? where id =?";
        int r = this.jdbcTemplate.update(updatesql, student2.getName(), student2.getCity(), student2.getId());
        return r;
    }





    @Override
    public int deletes(int student3){
        // deleting the data
        String  deletesql = " delete from student where id=?";
        int r = this.jdbcTemplate.update(deletesql, student3);

        return r;
    }






// using the single object using the RowMapper
    // we get the single data of the data


    @Override
    public Student getStudent(int studentId) {
        String sqlquer = "select *from student where id =?";
        RowMapper<Student>  rowMapper = new RowMapperImplementation();
        Student student = this.jdbcTemplate.queryForObject(sqlquer, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getMultiPle() {
        String sql= "select *from student";
        List<Student> students= this.jdbcTemplate.query(sql, new RowMapperImplementation());
        return  students;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
