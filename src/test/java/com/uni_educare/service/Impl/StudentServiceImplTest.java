package com.uni_educare.service.Impl;

import com.uni_educare.module.Student;
import com.uni_educare.module.StudentVO;
import com.uni_educare.repositary.StudentRepositary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(MockitoExtension.class)
public class StudentServiceImplTest {
    @Mock
    private StudentRepositary studentRepositary;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    StudentServiceImpl studentService;

    @Test
    public void findAllStudentsTest(){
        when(studentRepositary.findAll()).thenReturn(new ArrayList<>(Arrays.asList(new Student())));
        assertTrue("Test passed", studentService.findAllStudents().getBody().size() > 0);
    }

    @Test
    public void saveTest(){
        when(modelMapper.map(any(StudentVO.class),any(Class.class)))
                .thenReturn(new Student());
        when(modelMapper.map(any(Student.class),any(Class.class)))
                .thenReturn(new StudentVO());
        when(studentRepositary.save(any(Student.class))).thenReturn(new Student());
        assertTrue("Test passed", studentService.save(new StudentVO()).getBody() != null);
    }
}
