package com.ticketbooking.api.ticketbooking.models;

import com.ticketbooking.api.ticketbooking.helpers.CastType;
import com.ticketbooking.api.ticketbooking.helpers.SexType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MovieCast {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private SexType gender;
    private CastType castType;
    private int movieId;
}
