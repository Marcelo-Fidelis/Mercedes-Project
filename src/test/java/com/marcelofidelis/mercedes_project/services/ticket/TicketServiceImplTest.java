package com.marcelofidelis.mercedes_project.services.ticket;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;


import com.marcelofidelis.mercedes_project.domain.Department;
import com.marcelofidelis.mercedes_project.domain.Ticket;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicket;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicketUpdate;
import com.marcelofidelis.mercedes_project.repositories.TicketRepository;
import com.marcelofidelis.mercedes_project.services.TicketServiceImpl;


@ContextConfiguration(classes = TicketServiceImplTestCC.class)
@ExtendWith(MockitoExtension.class)

public class TicketServiceImplTest {

  

    @Mock
    private TicketRepository ticketRepository;

    @InjectMocks
    private TicketServiceImpl ticketService;

    @Test
    public void getTicketByTitle_ShouldReturnTicketByTitle() throws Exception {
        var department = new Department();
        var dtoTicket = new DtoTicket("title test", 1, department, 1, 200, 1, 1, false, 1);
        Ticket ticket = new Ticket(dtoTicket);
        

        Mockito.when(ticketRepository.findByTitle(ticket.getTitle()))
                .thenReturn(Optional.of(ticket));
        String title = "title test";
        Ticket found = ticketService.getTicketByTitle(title);
        
        Assertions.assertEquals("title test", found.getTitle());

    }

    @Test
    public void getTicketById_ShouldReturnTicketById() throws Exception {
        var department = new Department();
        var dtoTicket = new DtoTicket("title test", 1, department, 1, 200, 1, 1, false, 1);
        Ticket ticket = new Ticket(dtoTicket);
        var uuid = UUID.fromString("69abfb52-70f0-11ee-b962-0242ac120002");
        ticket.setId(uuid);
        Mockito.when(ticketRepository.findById(ticket.getId()))
                .thenReturn(Optional.of(ticket));
        Ticket found = ticketService.getTicketById(uuid);
        Assertions.assertEquals(uuid, found.getId());
    }

    @Test
    public void isTicketBlocked_ShouldReturnTrue() {
        var department = new Department();
        var dtoTicket = new DtoTicket("title test", 1, department, 1, 200, 1, 1, true, 1);
        Ticket ticket = new Ticket(dtoTicket);
        Assertions.assertTrue(ticketService.isTicketBlocked(ticket));
    }

    @Test
    public void updateTicketAttendent_IsBlocked_False_ShouldUpdateTheAttendant() throws Exception {
        var department = new Department();
        var dtoTicket = new DtoTicket("title test", 1, department, 1, 200, 255, 1, false, 1);
        Ticket ticket = new Ticket(dtoTicket);
        var ticketUpdate = new DtoTicketUpdate(null, null, 304, 5);
        var ticketUpdated = ticketService.updateTicket(ticket, ticketUpdate);
        Assertions.assertEquals(ticket.getTitle(), ticketUpdated.getTitle());
        Assertions.assertEquals(304, ticketUpdated.getAttendant());
        Assertions.assertEquals(5, ticketUpdated.getPriority());

    }

}
