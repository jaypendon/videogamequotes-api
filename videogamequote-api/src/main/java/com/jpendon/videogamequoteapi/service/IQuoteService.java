package com.jpendon.videogamequoteapi.service;

import java.util.List;

import com.jpendon.videogamequoteapi.entity.Quote;

public interface IQuoteService {
	public List<Quote> findAll();
	
	public void deleteById(Long id);
	
	public void save(Quote quote);
	
	public Quote findById(Long id);
	
	public Quote getRandomQuote();
	
	public List<Quote> saveAll(List<Quote> quotes);
}
