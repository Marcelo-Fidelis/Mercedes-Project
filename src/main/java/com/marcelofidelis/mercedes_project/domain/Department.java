package com.marcelofidelis.mercedes_project.domain;

import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name ="department")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String title;
    private String description;

    public Department(DtoDepartment dto){
        setTitle(dto.title());
        setDescription(dto.description());
    }
    
}
