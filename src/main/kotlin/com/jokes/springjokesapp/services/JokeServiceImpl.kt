package com.jokes.springjokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("chuckJoke")
class JokeServiceImpl(var chuckNorrisQuotes:ChuckNorrisQuotes ):JokeService {

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}