package ch.dukex.domain

import kotlinx.serialization.Serializable

@Serializable
data class Question(
    val question: String,
    val answers: Map<String, Boolean>
)
