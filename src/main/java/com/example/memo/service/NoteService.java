package com.example.memo.service;

import com.example.memo.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {

     public Note createNote(Note note);

   public List<Note> getAllNotes();

   public Note getNoteById(Long id);

     public Optional<Note> updateNote(Long id, Note updateNote);

     public boolean deleteNote(Long id);

}
