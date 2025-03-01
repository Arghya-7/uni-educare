package com.uni_educare.uni_educare.utils;

import com.uni_educare.uni_educare.Entities.Student;
import com.uni_educare.uni_educare.Repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AddDummyStudents {
    @Autowired
    StudentRepositary studentRepositary;
    @Bean
    public void addStudents(){
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
