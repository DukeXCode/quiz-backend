package ch.dukex.domain

import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val title: String,
    val questions: List<Question>
)
