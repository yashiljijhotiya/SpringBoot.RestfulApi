package com.ticketbooking.api.ticketbooking.controller;

import com.ticketbooking.api.ticketbooking.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    @GetMapping("/movie/{movie}")
    public ResponseEntity<Movie> getMovieInfo(@PathVariable String movie){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/movie/{id}")
    public ResponseEntity<Movie> removeMovie(@PathVariable int id){
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
