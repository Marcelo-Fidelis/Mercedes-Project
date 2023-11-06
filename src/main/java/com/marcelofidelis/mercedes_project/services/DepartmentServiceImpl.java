package com.marcelofidelis.mercedes_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelofidelis.mercedes_project.domain.Department;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartmentUpdate;
import com.marcelofidelis.mercedes_project.repositories.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(DtoDepartment dto) {
        var department = new Department(dto);
        return departmentRepository.save(department);
    }

    @Override
    public Department deleteDepartment(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDepartment'");
    }

    @Override
    public Department updateDepartment(Integer id, DtoDepartmentUpdate dtoUpdate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDepartment'");
    }

    public Department getDepartmentById(Integer id) throws Exception {
        return departmentRepository.findById(id).orElseThrow(() -> new Exception("Erro"));
    }
}
