package com.jpendon.videogamequoteapi.rest;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpendon.videogamequoteapi.entity.Quote;
import com.jpendon.videogamequoteapi.service.IQuoteService;

@RestController
@RequestMapping("/videogamequote/api/quotes")
public class VideoGameQuoteController {

	@Autowired
	private IQuoteService quoteService; 
	
	@GetMapping("/")
	public List<Quote> getQuotes() {
		
		return quoteService.findAll();
	}
	
	@DeleteMapping("/quote/{quoteId}")
	public String deleteQuote(@PathVariable("quoteId") Long id) {
		quoteService.deleteById(id);
		
		return "Successfully deleted quote id - " + id;
	}
	
	@PostMapping("/quote")
	public Quote addQuote(@RequestBody Quote quote) {
		quoteService.save(quote);
		
		return quote;
	}
	
	@PostMapping("/")
	public List<Quote> addQuotes(@RequestBody List<Quote> quotes) {
		quoteService.saveAll(quotes);
		
		return quotes;
	}
	
	@PutMapping("/quote")
	public Quote updateQuote(@RequestBody Quote quote) {
		quoteService.save(quote);
		return quote; 
	}
	
	@GetMapping("/quote/random")
	public Quote getRandomQuote() {	
		return quoteService.getRandomQuote(); 
	}
}
