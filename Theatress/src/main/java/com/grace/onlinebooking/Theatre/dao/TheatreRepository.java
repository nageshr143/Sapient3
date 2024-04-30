package com.grace.onlinebooking.Theatre.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grace.onlinebooking.Theatre.model.Theatre;


@Repository//DB connection
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
	
	
		
}

    
