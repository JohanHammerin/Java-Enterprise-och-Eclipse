package se.johan.lektion_2.uppgift2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.johan.lektion_2.uppgift2.service.StudentService;

@RestController
public class StudentController {
    private final StudentService studentService; // interface

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String getStudent() {
        return studentService.getStudentInfo(1L);
    }

    // JPA service kördes först tack vare dess @Primary annotation.

}
