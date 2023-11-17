package com.marcelofidelis.mercedes_project.servicestests.department;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.marcelofidelis.mercedes_project.services.DepartmentService;



@TestConfiguration
public class DepartmentServiceImplTestCC {
    @Bean
    public DepartmentService departmentService(){
        return new DepartmentService();

    }
}
