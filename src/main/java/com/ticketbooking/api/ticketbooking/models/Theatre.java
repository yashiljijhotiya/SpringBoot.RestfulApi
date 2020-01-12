package com.ticketbooking.api.ticketbooking.models;

import javax.persistence.*;
import java.util.List;

public class Theatre {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String  name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "theatreId")
    private List<Movie> movies;
    private int totalSeats;
    private int availableSeats;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private TheatreAddress theatreAddress;



}
