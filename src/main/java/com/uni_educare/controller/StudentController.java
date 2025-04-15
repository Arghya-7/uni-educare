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

import static com.uni_educare.constant.UniEducareConstant.*;

@RestController
@RequestMapping(STUDENT_CONTROLLER)
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class);
    @Autowired
    private StudentService studentService;

    @GetMapping(FINDALL)
    public ResponseEntity<List<Student>> findAllStudents() throws Exception {
        LOGGER.info("API called findAllStudents");
        return this.studentService.findAllStudents();
    }

    @PostMapping(REGISTER)
    public ResponseEntity<StudentVO> save(@RequestBody StudentVO studentVO) throws Exception {
        LOGGER.info("API called save, payload : {}", studentVO);
        return this.studentService.save(studentVO);
    }

}
