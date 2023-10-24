package com.marcelofidelis.mercedes_project.servicestests.department;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.marcelofidelis.mercedes_project.services.DepartmentServiceImpl;
import com.marcelofidelis.mercedes_project.services.IDepartmentService;



@TestConfiguration
public class DepartmentServiceImplTestCC {
    @Bean
    public IDepartmentService departmentServiceImpl(){
        return new DepartmentServiceImpl();

    }
}
