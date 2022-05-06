package com.tolkiana.ssedemo.serviceA

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.json
import reactor.core.publisher.Mono

@Component
class Handler {

    fun createEvent(request: ServerRequest): Mono<ServerResponse> =
        ok().json().bodyValue("Event created")
}
