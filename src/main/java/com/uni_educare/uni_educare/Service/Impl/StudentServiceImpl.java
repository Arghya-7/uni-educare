package com.uni_educare.uni_educare.Service.Impl;

import com.uni_educare.uni_educare.Dto.StudentVO;
import com.uni_educare.uni_educare.Entities.Student;
import com.uni_educare.uni_educare.Repositary.StudentRepositary;
import com.uni_educare.uni_educare.Service.StudentService;
import io.swagger.v3.oas.annotations.servers.Server;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepositary studentRepositary;
    private ModelMapper modelMapper;
    StudentServiceImpl(StudentRepositary studentRepositary, final ModelMapper modelMapper){
        this.studentRepositary = studentRepositary;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseEntity<List<Student>> findAllStudents() {
        return new ResponseEntity<List<Student>>(studentRepositary.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentVO> save(StudentVO studentVO) {
        Student student = modelMapper.map(studentVO, Student.class);
        return new ResponseEntity<StudentVO>(modelMapper.map(studentRepositary.save(student), StudentVO.class), HttpStatus.OK);
    }
}
