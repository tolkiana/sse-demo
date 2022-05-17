package com.tolkiana.ssedemo.library

import com.tolkiana.ssedemo.library.models.Event
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.inValues
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class EventListener(private val template: ReactiveMongoTemplate) {

    fun subscribe(): Flux<Event> {
        return template
            .changeStream(Event::class.java)
            .watchCollection("events")
            .filter(Criteria.where("operationType").`in`("insert"))
            .listen()
            .map { it.body }
    }

    fun subscribe(stage: String): Flux<Event> {
        return template
            .changeStream(Event::class.java)
            .watchCollection("events")
            .filter(Criteria.where("inStage").inValues(stage))
            .listen()
            .map { it.body }
    }
}
