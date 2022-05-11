package com.tolkiana.ssedemo.library

import com.tolkiana.ssedemo.library.models.Event
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface EventRepository: ReactiveMongoRepository<Event, String> {}
