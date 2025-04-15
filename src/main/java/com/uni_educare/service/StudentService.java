package com.uni_educare.service;

import com.uni_educare.module.Student;
import com.uni_educare.module.StudentVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    public ResponseEntity<List<Student>> findAllStudents();
    public ResponseEntity<StudentVO> save(StudentVO studentVO);
}
