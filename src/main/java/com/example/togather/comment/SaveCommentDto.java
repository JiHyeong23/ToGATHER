package com.example.togather.comment;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SaveCommentDto {
    private Long postId;
    private String body;
    private LocalDateTime createdAt;
}
