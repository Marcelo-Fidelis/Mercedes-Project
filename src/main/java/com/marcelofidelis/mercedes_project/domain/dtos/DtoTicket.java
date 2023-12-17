package com.marcelofidelis.mercedes_project.domain.dtos;

import com.marcelofidelis.mercedes_project.domain.department.Department;

public record DtoTicket(
String title, 
Integer type,
Department department,
Integer status,
Integer owner,
Integer attendant,
Integer ticketLog,
boolean isBlocked,
Integer priority
) {
    
}
