package com.example.noteapp.domain

import android.provider.ContactsContract
import com.example.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

//    fun getNotes(): Flow<List<ContactsContract.CommonDataKinds.Note>>

    fun getNotes(): Flow<List<Note>>
    suspend fun getNoteById(id: Int): ContactsContract.CommonDataKinds.Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}