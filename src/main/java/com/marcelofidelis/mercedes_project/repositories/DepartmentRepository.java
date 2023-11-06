package com.marcelofidelis.mercedes_project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelofidelis.mercedes_project.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

    Department findByTitle(String string);
    
}
