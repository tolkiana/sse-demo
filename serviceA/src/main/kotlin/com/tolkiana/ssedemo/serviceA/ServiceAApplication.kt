package com.tolkiana.ssedemo.serviceA

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.tolkiana.ssedemo.library", "com.tolkiana.ssedemo.serviceA"])
class ServiceAApplication

fun main(args: Array<String>) {
	runApplication<ServiceAApplication>(*args)
}
