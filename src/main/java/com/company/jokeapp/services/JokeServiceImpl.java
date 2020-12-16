package com.company.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /**
     * Constructors. Assigns ChuckNorrisQuotes object.
     */
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    /**
     * Gets random quote from ChuckNorrisQuotes object.
     * @return random quote from ChuckNorrisQuotes object
     */
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
