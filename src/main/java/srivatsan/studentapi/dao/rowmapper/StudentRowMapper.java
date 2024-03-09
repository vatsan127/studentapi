package srivatsan.studentapi.dao.rowmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.RowMapper;
import srivatsan.studentapi.model.Address;
import srivatsan.studentapi.model.Student;


import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getLong("age"));
        student.setBranch(rs.getString("branch"));
        student.setDegree(rs.getString("degree"));

        String addressJson = rs.getString("address");

        try {
            ObjectMapper mapper = new ObjectMapper();
            Address studentAddress = mapper.readValue(addressJson, Address.class);
            student.setAddress(studentAddress);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return student;
    }

}
