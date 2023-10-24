package com.marcelofidelis.mercedes_project.servicestests.ticket;





import java.util.Optional;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.marcelofidelis.mercedes_project.domain.Ticket;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicket;
import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicketUpdate;
import com.marcelofidelis.mercedes_project.repositories.TicketRepository;
import com.marcelofidelis.mercedes_project.services.ITicketService;



@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TicketServiceImplTestCC.class)
public class TicketServiceImplTest {
    
    @Autowired
    private ITicketService ticketService;
    
    @MockBean
    private TicketRepository ticketRepository;

    @Before
    public void setup(){
        var dtoTicket = new DtoTicket("title test", 1, 1, 1, 200,1,1, false, 1);
        var uuid =UUID.fromString("69abfb52-70f0-11ee-b962-0242ac120002");
        Ticket ticket = new Ticket(dtoTicket);
        ticket.setId(uuid);
        Mockito.when(ticketRepository.findById(ticket.getId()))
        .thenReturn(Optional.of(ticket));

        Mockito.when(ticketRepository.findByTitle(ticket.getTitle()))
        .thenReturn(Optional.of(ticket));
    }

    @Test
    public void getTicketByTitle_ShouldReturnTicketByTitle() throws Exception{
        String title = "title test";
        Ticket found = ticketService.getTicketByTitle(title);
        Assertions.assertEquals("title test", found.getTitle());
        
    }

    @Test
    public void getTicketById_ShouldReturnTicketById() throws Exception{
        var uuid =UUID.fromString("69abfb52-70f0-11ee-b962-0242ac120002");
        Ticket found = ticketService.getTicketById(uuid);
        Assertions.assertEquals(uuid, found.getId());
    }
    @Test
    public void isTicketBlocked_ShouldReturnTrue(){
         var dtoTicket = new DtoTicket("title test", 1, 1, 1, 200,1,1, true, 1);
         Ticket ticket = new Ticket(dtoTicket);
         Assertions.assertTrue(ticketService.isTicketBlocked(ticket));
    }

    @Test
    public void updateTicketAttendent_IsBlocked_False_ShouldUpdateTheAttendant() throws Exception{
        var dtoTicket = new DtoTicket("title test", 1, 1, 1, 200,255,1, false, 1);
        Ticket ticket = new Ticket(dtoTicket);
        var ticketUpdate = new DtoTicketUpdate(null, null, 304, 5);
        var ticketUpdated = ticketService.updateTicket(ticket, ticketUpdate);
        Assertions.assertEquals(ticket.getTitle(), ticketUpdated.getTitle());
        Assertions.assertEquals(304, ticketUpdated.getAttendant());
        Assertions.assertEquals(5, ticketUpdated.getPriority());
        
    }

   
}
