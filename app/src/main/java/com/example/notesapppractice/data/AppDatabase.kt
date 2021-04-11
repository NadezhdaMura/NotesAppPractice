package com.example.notesapppractice.data

import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class],version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getNoteDao(): NoteDao
}