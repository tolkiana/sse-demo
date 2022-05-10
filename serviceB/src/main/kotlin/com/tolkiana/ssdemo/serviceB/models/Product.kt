package com.tolkiana.ssdemo.serviceB.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.UUID

@Document("products")
data class Product(
    @Id val id: String = UUID.randomUUID().toString(),
    val name: String,
    val description: String,
    val createdOn: Instant = Instant.now()
)
