package ch.dukex.domain

import kotlinx.serialization.Serializable

@Serializable
data class Answer(
    val text: String,
    val isCorrect: Boolean
)
