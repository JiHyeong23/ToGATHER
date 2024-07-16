package com.example.togather.post;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;
    private PostMapper postMapper;

    public LocalDateTime savePost(SavePostDto savePostDto) {
        Post post = postMapper.saveDtoToPost(savePostDto);
        postRepository.save(post);
        return LocalDateTime.now();
    }
}
