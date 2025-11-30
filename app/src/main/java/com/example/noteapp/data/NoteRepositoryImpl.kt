package com.example.noteapp.data

import android.provider.ContactsContract
import com.example.noteapp.domain.NoteRepository
import com.example.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): ContactsContract.CommonDataKinds.Note? {
        return dao.getNoteById(id) as ContactsContract.CommonDataKinds.Note?
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}