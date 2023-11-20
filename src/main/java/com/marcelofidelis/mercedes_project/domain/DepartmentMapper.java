package com.marcelofidelis.mercedes_project.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.marcelofidelis.mercedes_project.domain.dtos.DtoDepartment;

@Mapper
public interface DepartmentMapper {
     public static final DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    @Mapping(target ="id", ignore = true)
    Department toDepartment (DtoDepartment dto);
    
    @Mapping(target = "id", ignore = true )
    @Mapping(target = "title", ignore = true)
    Department updateDepartment (DtoDepartment dto, @MappingTarget Department department);
}
