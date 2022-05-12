package com.tolkiana.ssedemo.serviceB

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class Route(private val handler: Handler) {

    @Bean("routes")
    fun routes(): RouterFunction<ServerResponse> =
        router {
            GET("events/stream", handler::subscribe)
        }
}
