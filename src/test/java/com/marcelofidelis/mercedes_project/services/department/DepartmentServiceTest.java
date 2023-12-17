package com.marcelofidelis.mercedes_project.services.department;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;


import org.springframework.test.context.ContextConfiguration;

import com.marcelofidelis.mercedes_project.domain.department.Department;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.repositories.DepartmentRepository;
import com.marcelofidelis.mercedes_project.services.DepartmentService;

@ContextConfiguration(classes = DepartmentServiceTestCC.class)
@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {

    @InjectMocks
    private DepartmentService departmentService;

    @Mock
    private DepartmentRepository departmentRepository;


    @Test
    public void createDepartment_ShouldCreateDepartment() {
        var dtoDepartment = new DtoDepartment("Test title", "This is a test description");
        departmentService.create(dtoDepartment);

    }
}
