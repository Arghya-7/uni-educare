package com.uni_educare.module;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "price")
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String subjectName;
    @Column(nullable = false)
    Long fees;
    @Column(nullable = false)
    String duration;
    @Column(nullable = false)
    String startDate;
    @Column(nullable = false)
    String closeDate;
    @Column(nullable = false)
    String facultyName;
}
