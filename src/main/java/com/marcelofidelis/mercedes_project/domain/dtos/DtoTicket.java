package com.marcelofidelis.mercedes_project.domain.dtos;

public record DtoTicket(
String title, 
Integer type,
Integer sector,
Integer status,
Integer owner,
Integer attendant,
Integer ticketLog,
boolean isBlocked,
Integer priority
) {
    
}
