package com.marcelofidelis.mercedes_project.services;




import java.util.UUID;

import org.springframework.stereotype.Service;

import com.marcelofidelis.mercedes_project.domain.Ticket;



@Service
public interface ITicketService {
    public Ticket getTicketByTitle(String title) throws Exception;

    public void updateTicketAttendent(int attendant);

    public Ticket getTicketById(UUID uuid) throws Exception;

    public boolean isTicketBlocked(Ticket ticket);     
   
}
