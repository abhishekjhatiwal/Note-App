package com.example.noteapp.domain.usecase

import com.example.noteapp.domain.NoteRepository
import com.example.noteapp.domain.model.Note

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}