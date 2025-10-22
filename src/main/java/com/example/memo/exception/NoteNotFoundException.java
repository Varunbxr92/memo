package com.example.memo.exception;

public class NoteNotFoundException extends RuntimeException {

    public NoteNotFoundException(Long id){
        super("Note not found with the Id: "+id);
    }
}
