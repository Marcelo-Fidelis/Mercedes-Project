package com.marcelofidelis.mercedes_project.controllers;


import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelofidelis.mercedes_project.domain.Department;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;
import com.marcelofidelis.mercedes_project.services.DepartmentService;


@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    
    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody DtoDepartment dto){
        
        return ResponseEntity.ok().body(departmentService.create(dto));
    }

    @GetMapping
    public ResponseEntity<Department> getDepartmentById(@PathVariable (value = "id") Integer id) throws Exception{
        
        return ResponseEntity.ok().body(departmentService.get(id));
    }

    
}
