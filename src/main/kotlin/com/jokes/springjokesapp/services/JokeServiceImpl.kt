package com.jokes.springjokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl(chuckNorrisQuotes: ChuckNorrisQuotes):JokeService {

    final val chuckNorrisQuotes = ChuckNorrisQuotes()

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}