package com.rebwon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaxiDispatchApiApplication

fun main(args: Array<String>) {
    runApplication<TaxiDispatchApiApplication>(*args)
}
