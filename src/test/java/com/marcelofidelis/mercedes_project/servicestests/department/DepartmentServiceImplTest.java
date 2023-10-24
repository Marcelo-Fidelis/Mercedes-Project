package com.marcelofidelis.mercedes_project.servicestests.department;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.marcelofidelis.mercedes_project.domain.Department;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.repositories.DepartmentRepository;
import com.marcelofidelis.mercedes_project.services.IDepartmentService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DepartmentServiceImplTestCC.class)
public class DepartmentServiceImplTest {
    
    @Autowired
    private IDepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @Before
    public void setup(){

    }

    @Test
    public void createDepartment_ShouldCreateDepartment(){
        var dtoDepartment = new DtoDepartment("Test title", "This is a test description");
        departmentService.createDepartment(dtoDepartment);

    }
}
