package com.example.memo.service;

import com.example.memo.exception.NoteNotFoundException;
import com.example.memo.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteServiceImpl implements NoteService{
    private final List<Note> notes = new ArrayList<>();

    private final AtomicLong cnt = new AtomicLong();

/**
 * Create Note
 *
 * */
    @Override
    public Note createNote(Note note) {
        note.setId(cnt.incrementAndGet());
        notes.add(note);
        return note;
    }

    /**
     * Fetch all Notes
     *
     * */
    @Override
    public List<Note> getAllNotes() {
        return notes;
    }

    /**
     * Get Note By Id
     *
     * */
    @Override
    public Note getNoteById(Long id) {
        return notes
                .stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(()->new NoteNotFoundException(id));
    }

    /**
     * Update Note
     *
     * */
    @Override
    public Optional<Note> updateNote(Long id, Note updateNote) {
        Optional<Note> obj = notes
                .stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
        obj.ifPresent(note -> {
            note.setTitle(updateNote.getTitle());
            note.setContent(updateNote.getContent());
        });
        return obj;
    }

    /**
     * Delete Note
     *
     * */
    @Override
    public boolean deleteNote(Long id) {
          return notes.removeIf(a -> a.getId().equals(id));
    }
}
