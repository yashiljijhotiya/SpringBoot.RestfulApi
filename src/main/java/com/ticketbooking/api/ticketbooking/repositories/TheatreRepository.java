package com.ticketbooking.api.ticketbooking.repositories;

import com.ticketbooking.api.ticketbooking.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
}
