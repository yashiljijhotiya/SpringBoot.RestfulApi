package com.ticketbooking.api.ticketbooking.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String name;
    private Date releaseDate;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private MovieDetail movieDetail;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "movieId")
    private MovieCast movieCast;
    private int theatreId;


}
