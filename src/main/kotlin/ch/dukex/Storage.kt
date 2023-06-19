package ch.dukex

import ch.dukex.domain.Quiz

class Storage(
    val quizzes: MutableList<Quiz> = mutableListOf()
) {
    fun addQuiz(quiz: Quiz) {
        quizzes.add(quiz)
    }
}
