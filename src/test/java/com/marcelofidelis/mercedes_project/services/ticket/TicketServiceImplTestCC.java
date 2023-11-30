package com.marcelofidelis.mercedes_project.services.ticket;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.marcelofidelis.mercedes_project.services.TicketService;
import com.marcelofidelis.mercedes_project.services.TicketServiceImpl;

@TestConfiguration
public class TicketServiceImplTestCC {
    
    @Bean
    public TicketService ticketServiceImpl(){
        return new TicketServiceImpl();

    }
}
