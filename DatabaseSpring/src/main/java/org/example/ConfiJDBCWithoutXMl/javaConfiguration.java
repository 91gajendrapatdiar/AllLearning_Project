package org.example.ConfiJDBCWithoutXMl;


import org.example.Entity.Student;
import org.example.StudentDaoImple;
import org.example.Studentdao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class javaConfiguration {
    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/spring_jdbc");
        ds.setUsername("gajendra");
        ds.setPassword("gajendra@9109");
        return ds;
        
    }
    
    @Bean("jdbcTemplate")
    public JdbcTemplate gettemplate(){
        
        
        JdbcTemplate jdbcTemplate= new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
    @Bean("studentdao")
    public Studentdao getStudentDao(){
        StudentDaoImple studentdao = new StudentDaoImple() ;
        studentdao.setJdbcTemplate(gettemplate());
        return studentdao;
    }
    
}
