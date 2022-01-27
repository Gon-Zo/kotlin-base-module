package com.example.module

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeasleyClientApplication

fun main(args: Array<String>) {
    runApplication<WeasleyClientApplication>(*args)
}
