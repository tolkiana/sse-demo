package com.tolkiana.ssedemo.serviceB

import com.tolkiana.ssedemo.library.EventListener
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.*
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Component
class Handler(private val eventListener: EventListener) {

    fun subscribe(request: ServerRequest): Mono<ServerResponse> =
        request.toMono()
            .map { eventListener.subscribe() }
            .flatMap { ServerResponse.ok().sse().body(it) }
}
