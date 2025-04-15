package com.uni_educare.service.Impl;

import com.uni_educare.controller.DashboardController;
import com.uni_educare.module.Student;
import com.uni_educare.module.StudentVO;
import com.uni_educare.repositary.StudentRepositary;
import com.uni_educare.service.StudentService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepositary studentRepositary;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<Student>> findAllStudents() {
        LOGGER.info("Started method findAllStudents...");
        return new ResponseEntity<List<Student>>(studentRepositary.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentVO> save(StudentVO studentVO) {
        LOGGER.info("Started method save, payload {}", studentVO);
        Student student = modelMapper.map(studentVO, Student.class);
        return new ResponseEntity<StudentVO>(modelMapper.map(studentRepositary.save(student), StudentVO.class), HttpStatus.OK);
    }
}
