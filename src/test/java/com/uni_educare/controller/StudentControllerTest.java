package com.uni_educare.controller;

import com.uni_educare.module.Student;
import com.uni_educare.module.StudentVO;
import com.uni_educare.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {
    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController studentController;

    @Test
    public void findAllStudentsTest() throws Exception {
        when(studentService.findAllStudents())
                .thenReturn(new ResponseEntity<List<Student>>(Arrays.asList(new Student()), HttpStatus.OK));
        assertTrue("Test passed", studentController.findAllStudents().getBody().size() == 1);
    }

    @Test
    public void saveTest() throws Exception {
        when(studentService.save(any()))
                .thenReturn(new ResponseEntity<StudentVO>(new StudentVO(), HttpStatus.OK));
        assertTrue("Test passed", studentController.save(new StudentVO()) != null);
    }
}
