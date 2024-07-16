package com.example.togather.comment;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/comments")
@AllArgsConstructor
public class CommentController {
    private CommentService commentService;

    @PostMapping("/save")
    public ResponseEntity createComment(@RequestBody SaveCommentDto saveCommentDto) {
        LocalDateTime savedAt = commentService.saveComment(saveCommentDto);

        return ResponseEntity.ok().body("save at, " + savedAt);
    }
}
