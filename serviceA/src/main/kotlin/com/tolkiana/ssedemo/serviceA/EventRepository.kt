package com.tolkiana.ssedemo.serviceA

import com.tolkiana.ssedemo.serviceA.models.Event
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface EventRepository: ReactiveMongoRepository<Event, String> {}
