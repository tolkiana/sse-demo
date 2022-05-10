package com.tolkiana.ssedemo.serviceA.models

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class EventDTO(
    val id: String?,
    val inStage: String,
    val outStage: String,
    val productId: String,
    val info: String? = null,
)

fun EventDTO.toEvent() = Event(
    inStage = inStage,
    outStage = outStage,
    productId = productId,
    info = info
)
