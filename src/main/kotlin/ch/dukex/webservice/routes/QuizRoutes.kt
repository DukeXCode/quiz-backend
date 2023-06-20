package ch.dukex.webservice.routes

import ch.dukex.Storage
import ch.dukex.domain.Answer
import ch.dukex.domain.Question
import ch.dukex.domain.Quiz
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.quizRoutes() {
    route("/quiz") {
        get {
                val answers = listOf(Answer("South Korea", true), Answer("USA", false))
                val question = Question("Best Flag?", answers)
                val quiz = Quiz("Boss Quiz", listOf(question))
                val storage = Storage()
                storage.addQuiz(quiz)
                call.respond(storage.quizzes)
        }
    }
}