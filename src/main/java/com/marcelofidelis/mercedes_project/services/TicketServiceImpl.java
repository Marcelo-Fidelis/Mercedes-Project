package com.marcelofidelis.mercedes_project.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelofidelis.mercedes_project.domain.Ticket;
import com.marcelofidelis.mercedes_project.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements ITicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket getTicketByTitle(String title) throws Exception {
        Ticket found = ticketRepository.findByTitle(title).orElseThrow(() -> new Exception("Erro"));
        return found;
    }

    @Override
    public void updateTicketAttendent(int attendant) {
        
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
