package srivatsan.studentapi.service;

import srivatsan.studentapi.model.Student;

import java.util.List;

public interface StudentService {
    Student addstudent(Student student);

    Student getStudentsById(Long id);

    List<Student> getStudents();

    Student removeStudent(Long id);
}
