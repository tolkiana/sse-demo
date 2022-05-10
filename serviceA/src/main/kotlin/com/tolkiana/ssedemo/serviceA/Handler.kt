package com.tolkiana.ssedemo.serviceA

import com.tolkiana.ssedemo.serviceA.models.EventDTO
import com.tolkiana.ssedemo.serviceA.models.toDTO
import com.tolkiana.ssedemo.serviceA.models.toEvent
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.bodyToMono
import org.springframework.web.reactive.function.server.json
import reactor.core.publisher.Mono

@Component
class Handler(private val service: EventService) {

    fun createEvent(request: ServerRequest): Mono<ServerResponse> =
        request.bodyToMono<EventDTO>().map {
            it.toEvent()
        }.flatMap {
            service.addEvent(it)
        }.map {
            it.toDTO()
        }.flatMap {
            ok().json().bodyValue(it)
        }
}
