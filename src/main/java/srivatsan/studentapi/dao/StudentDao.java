package srivatsan.studentapi.dao;

import srivatsan.studentapi.model.Address;
import srivatsan.studentapi.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {
    Student save(Student student);

    Optional<Student> findById(Long id);

    String convertAddressToJson(Address address);

    List<Student> findAll();

    void deleteById(Long id);

}
