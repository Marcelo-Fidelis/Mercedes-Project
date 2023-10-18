package com.marcelofidelis.mercedes_project.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) 
    private UUID id;

    @Column(nullable = false, length = 255)
    private String title;

    //TODO : Change this to a Sector Object
    @Column(nullable = false)
    private int sector;

    //TODO : Change this to a Type Object
    @Column(nullable = false)
    private int type;

    //TODO : Change this to a Status Object
    @Column(nullable = false)
    private int status;

    //TODO : Change this to a SystemUser Object
    @Column(nullable = false)
    private int owner;

    //TODO : Change this to a SystemUser Object
    @Column(nullable = false)
    private int attendant;

    //TODO : Change this to a TicketHistory Object
    @Column(nullable = false)
    private int ticketHistory;

    @Column(nullable = false)
    private boolean isBlocked;

    //TODO : Change this to a Priority Object
    @Column(nullable = false)
    private int priority;

    
}
