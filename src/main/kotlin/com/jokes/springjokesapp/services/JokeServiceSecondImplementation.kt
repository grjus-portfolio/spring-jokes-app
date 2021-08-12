package com.jokes.springjokesapp.services

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service("myJoke")
@Qualifier("myJoke")
open class JokeServiceSecondImplementation:JokeService {
    override fun getJoke(): String {
        return "My custom joke"
    }
}