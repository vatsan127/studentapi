package srivatsan.studentapi.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import srivatsan.studentapi.model.Student;
import srivatsan.studentapi.service.StudentService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createNewStudents(@Valid @RequestBody Student student) {
        Student savedStudent = studentService.addstudent(student);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/id").buildAndExpand(savedStudent.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student student = studentService.getStudentsById(id);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id) {
        Student student = studentService.removeStudent(id);
        return ResponseEntity.ok(String.format(
                "DATA REMOVED " +
                        "\nName: %s" +
                        "\nid: %s",
                student.getName(), String.valueOf(student.getId())));
    }

}
