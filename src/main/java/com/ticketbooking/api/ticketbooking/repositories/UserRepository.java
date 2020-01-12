package com.ticketbooking.api.ticketbooking.repositories;

import com.ticketbooking.api.ticketbooking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
