package com.marcelofidelis.mercedes_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelofidelis.mercedes_project.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{
    
}
