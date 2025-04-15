package com.uni_educare.helper;

import com.uni_educare.module.Student;
import com.uni_educare.repositary.StudentRepositary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AddDummyStudentsTest {
    @Mock
    StudentRepositary studentRepositary;

    @InjectMocks
    AddDummyStudents addDummyStudents;

    @Test
    public void runTest() throws Exception {
        addDummyStudents.run(new String[]{"abcd"});
        verify(studentRepositary, times(2)).save(Mockito.any(Student.class));
    }
}
