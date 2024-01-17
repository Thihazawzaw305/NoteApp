package com.example.noteapp.data

import com.example.noteapp.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                title = "A good day",
                description = "We have a good day. we go to the bla bla bla. And we are happy cus we did so many activities"
            ),
            Note(
                title = "A Bad day",
                description = "We have a bad day. We go to the bla bla bla."
            ),
            Note(
                title = "Another day",
                description = "Today is another day. We enjoy our time and do various activities."
            ),
            Note(
                title = "Memorable moments",
                description = "Creating memorable moments today. Cherishing every experience."
            ),
            Note(
                title = "Adventurous day",
                description = "Embarking on adventures today. Exploring new places and having fun."
            ),
            Note(
                title = "Productive day",
                description = "Making the most of the day by being productive. Achieving our goals."
            )
        )

    }
}