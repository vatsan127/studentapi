package srivatsan.studentapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import srivatsan.studentapi.dao.StudentDao;
import srivatsan.studentapi.dao.impl.StudentDaoImpl;
import srivatsan.studentapi.service.StudentService;
import srivatsan.studentapi.service.impl.StudentServiceImpl;

import javax.sql.DataSource;

@Configuration
public class StudentConfig {
    /*Bean for JdbcTemplate*/
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /*Bean for StudentDao which has a dependency JdbcTemplate*/
    @Bean
    public StudentDao studentDao(JdbcTemplate jdbcTemplate) {
        return new StudentDaoImpl(jdbcTemplate);
    }

    /*Bean for StudentService which has a dependency StudentDao*/
    @Bean
    public StudentService studentService(StudentDao studentDao) {
        return new StudentServiceImpl(studentDao);
    }
}
