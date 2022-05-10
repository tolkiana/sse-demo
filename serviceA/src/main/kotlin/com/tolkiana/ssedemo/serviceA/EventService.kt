package com.tolkiana.ssedemo.serviceA

import com.tolkiana.ssedemo.serviceA.models.Event
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class EventService(private val repository: EventRepository) {

    fun addEvent(event: Event): Mono<Event> {
        return repository.save(event)
    }
}
