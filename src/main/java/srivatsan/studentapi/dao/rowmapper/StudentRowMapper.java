package srivatsan.studentapi.dao.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import srivatsan.studentapi.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    /* Map Entity to Student object*/
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getLong("age"));
        student.setBranch(rs.getString("branch"));
        student.setDegree(rs.getString("degree"));
        return student;
    }

}
