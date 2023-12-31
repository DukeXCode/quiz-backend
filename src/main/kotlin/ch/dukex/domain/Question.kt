package ch.dukex.domain

import kotlinx.serialization.Serializable

@Serializable
data class Question(
    val text: String,
    val answers: List<Answer>
)
