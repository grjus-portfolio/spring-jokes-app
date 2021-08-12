package com.jokes.springjokesapp.controllers

import org.springframework.stereotype.Controller

@Controller
class JokeController {
    fun joke(){
        return JokeService.getJoke()
    }
}