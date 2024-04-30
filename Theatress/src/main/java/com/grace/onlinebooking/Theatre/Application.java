package com.grace.onlinebooking.Theatre;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;


	@SpringBootApplication
	
	public class Application {
		
		
		@Value(value = "${shows.url}")
		private String showsurl;
		
	    public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
	    
	    @Bean
	    public WebClient webClient() {
	    	
	    	WebClient client1 = WebClient.builder().baseUrl(showsurl).build();
	    	
	    	return client1;
	    }

}
	
