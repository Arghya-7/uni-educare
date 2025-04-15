package com.uni_educare.repositary;

import com.uni_educare.module.Student;
import com.uni_educare.module.StudentVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Long> {
}
