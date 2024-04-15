package srivatsan.studentapi.dao;

import srivatsan.studentapi.model.Student;

import java.util.List;
import java.util.Optional;

/*Interface for DAO layer*/
public interface StudentDao {
    Student save(Student student);

    Optional<Student> findById(Long id);

    List<Student> findAll();

    void deleteById(Long id);
}
