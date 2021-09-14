package com.example.contactrecyclerview.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactrecyclerview.Models.Note
import com.example.contactrecyclerview.Repository.NotesRepository
import kotlinx.coroutines.launch

class NotesViewModel:ViewModel() {
    var notesRepository=NotesRepository()
            fun saveNote(note:Note){
                viewModelScope.launch {
                    notesRepository.saveNote(note)
                }

            }

}