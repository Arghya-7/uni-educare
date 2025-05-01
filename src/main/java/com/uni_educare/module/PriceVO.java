package com.uni_educare.module;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class PriceVO {
    String subjectName;
    Long fees;
    String duration;
    String startDate;
    String closeDate;
    String facultyName;
}
