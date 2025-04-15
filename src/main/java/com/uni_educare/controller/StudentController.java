package com.uni_educare.controller;

import com.uni_educare.UniEducareApplication;
import com.uni_educare.exceptionHandler.UniEducareException;
import com.uni_educare.module.Student;
import com.uni_educare.module.StudentVO;
import com.uni_educare.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class);
    @Autowired
    private StudentService studentService;

    @GetMapping("/findStudents")
    public ResponseEntity<List<Student>> findAllStudents() throws Exception {
        LOGGER.info("API called findAllStudents");
        return this.studentService.findAllStudents();
    }

    @PostMapping("/register")
    public ResponseEntity<StudentVO> save(@RequestBody StudentVO studentVO) throws Exception {
        LOGGER.info("API called save, payload : {}", studentVO);
        return this.studentService.save(studentVO);
    }

}
