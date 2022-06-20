package com.jpendon.videogamequoteapi.QuoteRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpendon.videogamequoteapi.entity.Quote;

@Repository
public interface QuoteRepository extends CrudRepository<Quote,Long>{

}
