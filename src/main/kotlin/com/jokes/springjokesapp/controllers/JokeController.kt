package com.jokes.springjokesapp.controllers

import com.jokes.springjokesapp.services.JokeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class JokeController(@Qualifier("chuckJoke") val jokeService: JokeService) {



    @RequestMapping("/","")
    fun showJoke(model:Model):String{
        model.addAttribute("joke",jokeService.getJoke())
        return "index"
    }
}