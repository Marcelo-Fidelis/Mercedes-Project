package com.marcelofidelis.mercedes_project.servicestests.department;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.repositories.DepartmentRepository;
import com.marcelofidelis.mercedes_project.services.DepartmentService;

@DataJpaTest
@ContextConfiguration(classes = DepartmentServiceTestCC.class)
public class DepartmentServiceIntTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentService departmentServiceImpl;

    @Test
    public void getDepartmentId_ShouldReturnTheId() {
        DtoDepartment dto = new DtoDepartment("Almoxarifado", "Essa é uma descrição de teste");
        var test = departmentServiceImpl.create(dto);
        Assertions.assertEquals(1, test.getId());

    }
}
