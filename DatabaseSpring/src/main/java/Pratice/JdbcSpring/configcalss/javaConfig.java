package Pratice.JdbcSpring.configcalss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "Pratice.JdbcSpring.configcalss")
public class javaConfig {

    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dr = new DriverManagerDataSource();
        dr.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dr.setUrl("jdbc:mysql://127.0.0.1:3306/spring");
        dr.setUsername("gajendra");
        dr.setPassword("gajendra@9109");

        return dr;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTem() {
    JdbcTemplate jdbcTemplate= new JdbcTemplate();
    jdbcTemplate.setDataSource(getDataSource());
    return jdbcTemplate;

    }
//    @Bean
//    public  EmployeInfo getempInfo(){
//        EmployeInfoImple employeInfoImple =new EmployeInfoImple();
//        employeInfoImple.setJdbcTemplate(getTem());
//        return employeInfoImple;
//    }

}
