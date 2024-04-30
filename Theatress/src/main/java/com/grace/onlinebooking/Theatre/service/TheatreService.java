package com.grace.onlinebooking.Theatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.grace.onlinebooking.Theatre.dao.TheatreRepository;
import com.grace.onlinebooking.Theatre.model.Show;
import com.grace.onlinebooking.Theatre.model.Theatre;

import reactor.core.publisher.Mono;



@Service
public class TheatreService {

  @Autowired
  private TheatreRepository thetreRepository;
  
  @Autowired
  private WebClient webClient;


  public Iterable<Theatre> findAllThetres() {
	  
		return thetreRepository.findAll();
	}

  public Theatre createThetre(Theatre thetreobj) {
		return thetreRepository.save(thetreobj);	
	}


  public String getThetreNameById(int thetreId) {
      // Implement logic to retrieve movie name by movieId from the repository
		
		System.out.println(" Entered  the service layer"+thetreId);
		Theatre movie = thetreRepository.getById(thetreId);
		System.out.println(" Entered  the service layer"+movie.getThetreName());
      return (movie != null) ? movie.getThetreName() : null;
  }
	public Show getShowDetails() {
		
		Mono<Show> showDetails = webClient.get().uri("/allShows").retrieve().bodyToMono(Show.class);
		return showDetails.block();	
		
	}

	public Theatre createThetrewithShows(Theatre thetre) {
		// TODO Auto-generated method stub
		return null;
	}
}
