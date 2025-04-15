package com.uni_educare.helper;

import com.uni_educare.controller.DashboardController;
import com.uni_educare.module.Student;
import com.uni_educare.repositary.StudentRepositary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AddDummyStudents implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class);

    @Autowired
    StudentRepositary studentRepositary;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Method called run, payload : {}", Arrays.toString(args));
        Student student1 = new Student();
        student1.setName("Ram");
        student1.setEmail("ram@gmail.com");
        Student student2 = new Student();
        student2.setName("Sham");
        student2.setEmail("sham@gmail.com");
        studentRepositary.save(student1);
        studentRepositary.save(student2);
    }
}
