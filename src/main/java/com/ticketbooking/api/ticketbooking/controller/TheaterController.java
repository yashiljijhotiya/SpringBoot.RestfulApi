package com.ticketbooking.api.ticketbooking.controller;

import com.ticketbooking.api.ticketbooking.models.Theatre;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TheaterController {

    @GetMapping("all/city/{city}")
    public ResponseEntity<List<Theatre>> getAllTheaterByCity(@PathVariable String city){
      return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("all/movie/{city}/{movie}")
    public ResponseEntity<List<Theatre>> getAllTheaterByMovie(@PathVariable String city,@PathVariable String movie){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Theatre> addTheaterByCity(@RequestBody Theatre theatre ){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("remove")
    public ResponseEntity<Theatre> removeTheaterByCity(@RequestBody Theatre theatre ){
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @PutMapping("update")
//    public ResponseEntity<Theatre> updateTheaterByCity(RequestBody Theatre theatre ){
//        return new ResponseEntity<>(HttpStatus.OK);
//    }




}
