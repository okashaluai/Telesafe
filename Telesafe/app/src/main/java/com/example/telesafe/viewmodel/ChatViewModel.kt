package com.example.telesafe.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.telesafe.model.Message

class ChatViewModel : ViewModel() {
    private val _messages = mutableStateListOf<Message>()
    val messages: List<Message> = _messages

    fun sendMessage(text: String) {
        if (text.isNotBlank()) {
            _messages.add(Message(text = text, isSentByUser = true))
            // Simuliere eine Antwort
            simulateResponse()
        }
    }

    private fun simulateResponse() {
        _messages.add(
            Message(
                text = "Nachricht empfangen!",
                isSentByUser = false
            )
        )
    }
}