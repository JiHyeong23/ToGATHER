package com.example.togather.post;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @PostMapping("/save")
    public ResponseEntity createPost(@RequestBody SavePostDto savePostDto) {
        LocalDateTime savedAt = postService.savePost(savePostDto);

        return ResponseEntity.ok().body("save at, " + savedAt);
    }
}
