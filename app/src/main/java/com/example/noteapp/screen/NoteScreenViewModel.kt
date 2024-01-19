package com.example.noteapp.screen

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.noteapp.data.NoteDataSource
import com.example.noteapp.model.Note
import com.example.noteapp.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteScreenViewModel @Inject constructor(private val repository: NoteRepository ) : ViewModel()  {
   // private var noteList = mutableStateListOf<Note>()

    private val _noteList = MutableStateFlow<List<Note>>(emptyList())
     val noteList  = _noteList.asStateFlow()
    init {
      viewModelScope.launch(Dispatchers.IO) {
          repository.getAllNote().distinctUntilChanged().collect{
              listNote ->
//              if (listNote.isNullOrEmpty()){
//                  Log.d("Empty",":noteList is empty or null")
//              }
//              else{
                  _noteList.value = listNote
//              }
          }
      }
    }


    // android the post andorid the post andorid codigo codigo codigo codigo codigo android android adnorid andorid andorid adnorid andorid andorid andorid   the android anorid andorid android a

    fun addNote(note : Note) = viewModelScope.launch(Dispatchers.IO) { repository.addNote(note) }
    fun removeNote(note : Note)= viewModelScope.launch(Dispatchers.IO){ repository.removeNote(note) }
    fun upDateNote(note : Note)= viewModelScope.launch(Dispatchers.IO) { repository.upDateNote(note) }

}