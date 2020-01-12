package com.ticketbooking.api.ticketbooking.models;

import javax.persistence.*;

@Entity
@Table(name = "TheatreAddress")
public class TheatreAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String state;
    private String country;
    private String zip;
}
