package com.jokes.springjokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service("chuckJoke")
@Qualifier("chuckJoke")

open class JokeServiceImpl:JokeService {

    override fun getJoke(): String {
        val chokeNorrisQuotes = ChuckNorrisQuotes()
        return chokeNorrisQuotes.randomQuote
    }
}