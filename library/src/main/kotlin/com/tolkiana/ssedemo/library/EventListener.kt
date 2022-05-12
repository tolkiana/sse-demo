package com.tolkiana.ssedemo.library

import com.tolkiana.ssedemo.library.models.Event
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.time.Duration
import java.util.function.Function

@Component
class EventListener(private val template: ReactiveMongoTemplate) {

    fun subscribe(): Flux<Event> {
//        return template
//            .changeStream(Event::class.java)
//            .watchCollection("events")
//            .listen()
//            .map {
//                println("----Listing message---")
//                println(it.body)
//                it.body
//            }
        return Flux.interval(Duration.ofSeconds(5)).map {
            Event( inStage = "TEST", outStage = "TEST", info = "details", productId = "124")
        }
    }
}