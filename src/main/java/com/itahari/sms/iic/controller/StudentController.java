package com.itahari.sms.iic.controller;

import com.itahari.sms.iic.model.Student;
import com.itahari.sms.iic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("{sid}")
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    public Optional<Student> getStudentById(@PathVariable("sid") String sid) {
        return studentService.getStudentById(sid);
    }

    @GetMapping("all")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("add")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("update/{sid}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void updateStudent(@RequestBody Student student, @PathVariable("sid") String sid) {
        Optional<Student> temp = studentService.getStudentById(sid);
        if (temp.isPresent()) {
           studentService.updateStudent(student);
        }
    }

    @DeleteMapping("delete/{sid}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteStudent(@PathVariable("sid") String sid) {
        Optional<Student> temp = studentService.getStudentById(sid);
        if (temp.isPresent()) {
            studentService.deleteStudent(sid);
        }
    }
}
