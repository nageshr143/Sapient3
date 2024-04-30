package com.grace.onlinebooking.Theatre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grace.onlinebooking.Theatre.model.Theatre;
import com.grace.onlinebooking.Theatre.service.TheatreService;


@RestController

public class TheatreController {

  @Autowired
  private TheatreService thetreService;

  @PostMapping(value="/createThetre")
  public ResponseEntity<Theatre> createThetre(@RequestBody Theatre thetre) {
	  	  Theatre createdThetre = thetreService.createThetre(thetre);
    return new ResponseEntity<>(createdThetre, HttpStatus.CREATED);
  }

  
  @PostMapping(value="/assigntheatrewithShows")
  public ResponseEntity<Theatre> createThetreWithShows(@RequestBody Theatre thetre) {
	  
	  	  Theatre createdThetre = thetreService.createThetrewithShows(thetre);
    return new ResponseEntity<>(createdThetre, HttpStatus.CREATED);
  }
  
	
  @GetMapping(value="/allThetres")
  public Iterable<Theatre>getAllThetres(){
	 		return thetreService.findAllThetres();
	}
  
  
  @GetMapping(value="/getTheatreName")
  public String getTheatreName(@RequestParam String thetreId) {
  
  	int number = Integer.parseInt(thetreId);
  	return thetreService.getThetreNameById(number);
	}
  @GetMapping(value="/getTheatreNameWithRespectiveShows")
  public String getThetrewithShows(@RequestParam String thetreId) {
  	int number = Integer.parseInt(thetreId);
  	return thetreService.getThetreNameById(number);
	}
}