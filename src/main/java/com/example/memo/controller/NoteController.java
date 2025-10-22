package com.example.memo.controller;

import com.example.memo.model.Note;
import com.example.memo.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }
    /**
     * `POST /notes` – Create a new note
     * End point to create the Notes
     * */

    @PostMapping
    public ResponseEntity<Note> createNote(@Valid @RequestBody Note note){
        return ResponseEntity.ok(noteService.createNote(note));
    }

    /**
     * `GET /notes` – Retrieve all notes
     * End point to Retrieve all the notes
     * */

    @GetMapping
    public ResponseEntity<List<Note>> getAllNotes(){
        return ResponseEntity.ok(noteService.getAllNotes());
    }

    /**
     *  `GET /notes/:id` – Retrieve a specific note by ID
     * End point to Retrieve the note by ID
     * */

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNotesById(@PathVariable Long id){
       return ResponseEntity.ok(noteService.getNoteById(id));
    }

    /**
     *   `PUT /notes/:id` – Update a note by ID
     * End point to Update the note
     * */

    @PutMapping("/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable Long id, @Valid @RequestBody Note note){

        return noteService.updateNote(id,note)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     *  `DELETE /notes/:id` – Delete a note by ID
     * End point to Delete the Notes By ID
     * -
     * */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable Long id){
       if (noteService.deleteNote(id)){
           return ResponseEntity.noContent().build();
       }
       return ResponseEntity.notFound().build();
    }

}
