package com.jokes.springjokesapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringJokesAppApplication

fun main(args: Array<String>) {
	runApplication<SpringJokesAppApplication>(*args)
}
