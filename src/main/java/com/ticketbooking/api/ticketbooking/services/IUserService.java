package com.ticketbooking.api.ticketbooking.services;

import com.ticketbooking.api.ticketbooking.models.Booking;
import com.ticketbooking.api.ticketbooking.models.User;
import org.graalvm.compiler.lir.LIRInstruction;

public interface IUserService {

     User getUserDetail(int id);
     User createUser(User user);
     Boolean deleteUser(int id);
     User updateUser(User user);

}
