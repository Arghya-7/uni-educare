package com.uni_educare.uni_educare.Controllers;

import com.uni_educare.uni_educare.Dto.StudentVO;
import com.uni_educare.uni_educare.Entities.Student;
import com.uni_educare.uni_educare.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/findStudents")
    public ResponseEntity<List<Student>> findAllStudents() throws Exception{
        return this.studentService.findAllStudents();
    }

    @PostMapping("/register")
    public ResponseEntity<StudentVO> save(@RequestBody StudentVO studentVO){
        return this.studentService.save(studentVO);
    }

}
