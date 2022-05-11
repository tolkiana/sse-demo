package com.tolkiana.ssedemo.serviceB

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.tolkiana.ssedemo.library", "com.tolkiana.ssedemo.serviceB"])
class ServiceBApplication

fun main(args: Array<String>) {
    runApplication<ServiceBApplication>(*args)
}
