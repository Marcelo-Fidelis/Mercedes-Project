package com.marcelofidelis.mercedes_project.servicestests.ticket;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.marcelofidelis.mercedes_project.services.ITicketService;
import com.marcelofidelis.mercedes_project.services.TicketServiceImpl;

@TestConfiguration
public class TicketServiceImplTestCC {
    
    @Bean
    public ITicketService ticketServiceImpl(){
        return new TicketServiceImpl();

    }
}
