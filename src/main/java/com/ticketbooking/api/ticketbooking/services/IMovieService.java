package com.ticketbooking.api.ticketbooking.services;

import com.ticketbooking.api.ticketbooking.models.Movie;

public interface IMovieService {
    Movie addMovie(Movie movie);
    Boolean removeMovie(int id);

}
