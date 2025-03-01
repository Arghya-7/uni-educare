package com.uni_educare.uni_educare.Repositary;

import com.uni_educare.uni_educare.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Long> {
}
