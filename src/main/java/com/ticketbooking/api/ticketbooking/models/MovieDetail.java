package com.ticketbooking.api.ticketbooking.models;

import javax.persistence.*;

@Entity
@Table(name = "MovieDetail")
public class MovieDetail {
     @Id
     @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private float rating;

}
