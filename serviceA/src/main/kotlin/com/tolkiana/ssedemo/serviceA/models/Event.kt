package com.tolkiana.ssedemo.serviceA.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.UUID

@Document("events")
data class Event (
    @Id val id: String = UUID.randomUUID().toString(),
    val inStage: String,
    val outStage: String,
    val productId: String,
    val info: String?,
    val createdOn: Instant = Instant.now()
)

fun Event.toDTO() = EventDTO(id, inStage, outStage, productId, info)
