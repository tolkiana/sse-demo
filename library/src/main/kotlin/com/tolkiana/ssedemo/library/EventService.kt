package com.tolkiana.ssedemo.library

import com.tolkiana.ssedemo.library.models.Event
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class EventService(private val repository: EventRepository) {

    fun addEvent(event: Event): Mono<Event> {
        return repository.save(event)
    }
}
