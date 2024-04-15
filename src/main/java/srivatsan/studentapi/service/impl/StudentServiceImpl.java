package srivatsan.studentapi.service.impl;

import srivatsan.studentapi.dao.StudentDao;
import srivatsan.studentapi.exception.StudentNotFoundException;
import srivatsan.studentapi.model.Student;
import srivatsan.studentapi.service.StudentService;

import java.util.List;
import java.util.Optional;


public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /*Create student record*/
    @Override
    public Student addstudent(Student student) {
        return studentDao.save(student);
    }

    /*Fetch all student records*/
    public List<Student> getStudents() {
        List<Student> studentList = studentDao.findAll();
        return studentList;
    }

    /*Fetch student record by ID*/
    public Student getStudentsById(Long id) {
        Optional<Student> optionalStudent = studentDao.findById(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            throw new StudentNotFoundException();
        }
    }

    /*Delete Student record by ID*/
    public Student removeStudent(Long id) {
        Optional<Student> optionalStudent = studentDao.findById(id);
        if (optionalStudent.isPresent()) {
            studentDao.deleteById(id);
        } else {
            throw new StudentNotFoundException();
        }
        return optionalStudent.get();
    }
}
