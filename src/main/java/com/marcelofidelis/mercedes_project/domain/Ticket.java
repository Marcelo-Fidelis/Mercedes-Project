package com.marcelofidelis.mercedes_project.domain;

import java.util.UUID;

import com.marcelofidelis.mercedes_project.domain.dtos.DtoTicket;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ticket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ticket")
public class Ticket {

    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private UUID id;

    @Column(nullable = false, length = 255)
    private String title;

    //TODO : Change this to a Sector Object
    @Column(nullable = false)
    private Integer sector;

    //TODO : Change this to a Type Object
    @Column(nullable = false)
    private Integer type;

    //TODO : Change this to a Status Object
    @Column(nullable = false)
    private Integer status;

    //TODO : Change this to a SystemUser Object
    @Column(nullable = false)
    private Integer owner;

    //TODO : Change this to a SystemUser Object
    
    private Integer attendant;

    //TODO : Change this to a TicketHistory Object
    @Column(nullable = false)
    private Integer ticketLog;

    @Column(nullable = false)
    private boolean isBlocked;

    //TODO : Change this to a Priority Object
    @Column(nullable = false)
    private Integer priority;

    public Ticket(DtoTicket dto){
        this.setTitle(dto.title());
        this.setSector(dto.sector());
        this.setType(dto.type());
        this.setStatus(dto.status());
        this.setOwner(dto.owner());
        this.setTicketLog(dto.ticketLog());
        this.setBlocked(dto.isBlocked());
        this.setPriority(dto.priority());
        
    }
}
