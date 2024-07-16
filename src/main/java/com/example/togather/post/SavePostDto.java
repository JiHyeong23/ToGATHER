package com.example.togather.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SavePostDto {
    private String title;
    private String body;
    private LocalDateTime createdAt;
}
