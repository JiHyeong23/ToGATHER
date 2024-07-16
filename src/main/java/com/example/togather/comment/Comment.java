package com.example.togather.comment;

import com.example.togather.postComment.PostComment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Comment {
    @Id
    private Long id;
    private String body;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    @OneToMany(mappedBy = "comment")
    private List<PostComment> postComment;
}
