package com.example.memo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationException(MethodArgumentNotValidException ex){

        Map<String,String> err = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(e -> err.put(e.getField(),e.getDefaultMessage())
                );
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> handleAllException(Exception ex){

        Map<String,String> err = new HashMap<>();
        err.put("error","An unexpected error occurred: "+ex.getMessage());
        return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoteNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoteNotFoundException(NoteNotFoundException e){
        Map<String,String> error = new HashMap<>();
        error.put("error",e.getMessage());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

}
