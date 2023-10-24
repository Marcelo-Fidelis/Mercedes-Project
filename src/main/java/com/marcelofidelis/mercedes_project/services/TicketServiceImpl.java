package com.marcelofidelis.mercedes_project.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelofidelis.mercedes_project.domain.Ticket;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicketUpdate;
import com.marcelofidelis.mercedes_project.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements ITicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket getTicketByTitle(String title) throws Exception {
        Ticket found = ticketRepository.findByTitle(title).orElseThrow(() -> new Exception("Erro"));
        System.out.println();
        return found;
    }

    @Override
    public Ticket updateTicket(Ticket ticket, DtoTicketUpdate ticketUpdated) throws Exception {
        
        if (!(isTicketBlocked(ticket))) {
            ticket.ticketUpdate(ticketUpdated);
            return ticket;
        }
        throw new Exception("Ticket bloquado");       
    }

    @Override
    public Ticket getTicketById(UUID uuid) throws Exception {
        Ticket found = ticketRepository.findById(uuid).orElseThrow(() -> new Exception("Erro"));
        return found;
    }

    @Override
    public boolean isTicketBlocked(Ticket ticket) {
        return ticket.isBlocked();
    }
}
