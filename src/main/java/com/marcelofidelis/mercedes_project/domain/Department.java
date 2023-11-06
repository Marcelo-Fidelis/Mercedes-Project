package com.marcelofidelis.mercedes_project.domain;

import java.io.Serializable;

import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name ="department")
@Entity(name ="department")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String title;
    @Column
    private String description;

    public Department(DtoDepartment dto){
        setTitle(dto.title());
        setDescription(dto.description());
    }
    
}
