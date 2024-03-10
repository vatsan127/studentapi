package srivatsan.studentapi.dao.impl;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import srivatsan.studentapi.dao.StudentDao;
import srivatsan.studentapi.dao.rowmapper.StudentRowMapper;
import srivatsan.studentapi.model.Student;

import java.util.List;
import java.util.Optional;

import static srivatsan.studentapi.constant.QueryConstants.*;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student save(Student student) {
        jdbcTemplate.update(INSERT_STUDENT, student.getName(), student.getAge(),
                student.getDegree(), student.getBranch());
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = jdbcTemplate.query(SELECT_STUDENT, new StudentRowMapper());
        return studentList;
    }

    @Override
    public Optional<Student> findById(Long id) {
        Student student;
        try {
            student = jdbcTemplate.queryForObject(SELECT_STUDENT_BY_ID, new StudentRowMapper(), id);
        } catch (IncorrectResultSizeDataAccessException e) {
            student = null;
        }
        return Optional.ofNullable(student);
    }


    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update(DELETE_STUDENT, id);
    }
}
