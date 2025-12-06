package com.example.telesafe.model

data class Message(
    val id: String = java.util.UUID.randomUUID().toString(),
    val text: String,
    val timestamp: Long = System.currentTimeMillis(),
    val isSentByUser: Boolean
)