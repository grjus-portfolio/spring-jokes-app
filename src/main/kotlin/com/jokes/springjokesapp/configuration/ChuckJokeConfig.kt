package com.jokes.springjokesapp.configuration

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChuckJokeConfig {

    @Bean
    fun chuckNorrisJoke():ChuckNorrisQuotes{
        return ChuckNorrisQuotes()
    }

}