package com.example.memo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    private Long id;
    @NotBlank(message = "Title is required field")
    private String title;
    @NotBlank(message = "Content is required field")
    private String content;


}
