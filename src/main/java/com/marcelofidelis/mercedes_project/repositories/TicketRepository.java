package com.marcelofidelis.mercedes_project.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelofidelis.mercedes_project.domain.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,UUID>{
    
}
