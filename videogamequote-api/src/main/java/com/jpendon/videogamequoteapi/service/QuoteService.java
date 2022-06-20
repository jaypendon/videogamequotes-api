package com.jpendon.videogamequoteapi.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpendon.videogamequoteapi.QuoteRepository.QuoteRepository;
import com.jpendon.videogamequoteapi.entity.Quote;

@Service
public class QuoteService implements IQuoteService {
	@Autowired
	private QuoteRepository repository; 
	
	@Override
	public List<Quote> findAll() {
		return (List<Quote>) repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	@Override 
	public void save(Quote quote) {
		repository.save(quote);
	}

	@Override
	public Quote findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Quote getRandomQuote() {
		int numRows = (int)repository.count();			
		Random random = new Random();	
		Long randomId = Long.valueOf(random.nextInt(numRows) + 1);
		
		return findById(randomId);
	}

	@Override
	public List<Quote> saveAll(List<Quote> quotes) {
		repository.saveAll(quotes);
		return quotes;
	}
	

}
