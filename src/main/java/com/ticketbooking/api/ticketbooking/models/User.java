package com.ticketbooking.api.ticketbooking.models;
import com.ticketbooking.api.ticketbooking.helpers.SexType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Date dob;
    private SexType gender;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private UserAddress address;

}
