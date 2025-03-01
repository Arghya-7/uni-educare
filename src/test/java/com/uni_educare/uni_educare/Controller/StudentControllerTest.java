package com.uni_educare.uni_educare.Controller;

import com.uni_educare.uni_educare.Controllers.StudentController;
import com.uni_educare.uni_educare.Entities.Student;
import com.uni_educare.uni_educare.Service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
public class StudentControllerTest {
    @MockBean
    StudentService studentService;

    @Autowired
    StudentController studentController;

    private List<Student> studentList = List.of(new Student(), new Student());

    @Test
    public void testFindStudents() throws Exception {
        when(studentService.findAllStudents()).thenReturn(new ResponseEntity<List<Student>>(studentList,HttpStatus.OK));
        assertNotNull("Not null", studentController.findAllStudents());
    }

}
