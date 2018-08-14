package com.kotlinexpertise.hibernatedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HibernateDemoApplication

fun main(args: Array<String>) {
    runApplication<HibernateDemoApplication>(*args)
}
