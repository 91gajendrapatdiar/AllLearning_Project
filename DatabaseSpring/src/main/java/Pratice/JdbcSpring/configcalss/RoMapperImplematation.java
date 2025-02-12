package Pratice.JdbcSpring.configcalss;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoMapperImplematation  implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee= new Employee();
        employee.setId(rs.getInt(1));
        employee.setName(rs.getString(2));
        employee.setDesignation(rs.getString(3));
        employee.setSalary(rs.getInt(4));
        return employee;
    }
}
