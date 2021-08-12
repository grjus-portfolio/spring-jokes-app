package com.jokes.springjokesapp.controllers
import com.jokes.springjokesapp.`data-model`.SampleJson
import com.jokes.springjokesapp.services.JokeService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class JokeController(@Qualifier("chuckJoke") val jokeService: JokeService) {

    @RequestMapping("/","")
    fun showJoke(model:Model):String{
        model.addAttribute("joke",jokeService.getJoke())
        return "index"
    }


}
@RestController
class JsonController{
    @GetMapping("/sample-json")
    fun showJson():SampleJson{
        return SampleJson("Grzegorz","Juszkiewicz",37)
    }
}