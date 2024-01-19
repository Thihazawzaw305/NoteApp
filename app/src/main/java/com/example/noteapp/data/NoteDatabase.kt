package com.example.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.noteapp.model.Note
import com.example.noteapp.utils.DateTypeConverter
import com.example.noteapp.utils.UUIDTypeConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateTypeConverter::class,UUIDTypeConverter::class)
abstract class NoteDatabase  : RoomDatabase(){
    abstract fun noteDao(): NoteDatabaseDao
}