package com.marcelofidelis.mercedes_project.services;




import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.marcelofidelis.mercedes_project.domain.Ticket;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicketUpdate;



@Service
public interface ITicketService {
    public Ticket getTicketByTitle(String title) throws Exception;

    public Ticket updateTicket(Ticket ticket,DtoTicketUpdate ticketUpdate) throws Exception;

    public Ticket getTicketById(UUID uuid) throws Exception;

    public boolean isTicketBlocked(Ticket ticket);     
   
}
