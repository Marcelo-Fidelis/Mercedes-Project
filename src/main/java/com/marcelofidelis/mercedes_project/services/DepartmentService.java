package com.marcelofidelis.mercedes_project.services;

import com.marcelofidelis.mercedes_project.domain.Department;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartmentUpdate;

public interface DepartmentService {

    Department createDepartment(DtoDepartment dto);
    Department deleteDepartment(Integer id);
    Department updateDepartment(Integer id, DtoDepartmentUpdate dtoUpdate);

}
