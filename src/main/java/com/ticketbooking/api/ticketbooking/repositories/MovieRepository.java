package com.ticketbooking.api.ticketbooking.repositories;

import com.ticketbooking.api.ticketbooking.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
