package com.uni_educare.uni_educare.Service;

import com.uni_educare.uni_educare.Dto.StudentVO;
import com.uni_educare.uni_educare.Entities.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentService {
    public ResponseEntity<List<Student>> findAllStudents();
    public ResponseEntity<StudentVO> save(StudentVO studentVO);
}
