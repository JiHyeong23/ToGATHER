package com.example.togather.comment;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CommentService {

    private CommentRepository commentRepository;
    private CommentMapper commentMapper;

    public LocalDateTime saveComment(SaveCommentDto saveCommentDto) {
        Comment comment = commentMapper.SaveDtoToComment(saveCommentDto);
        commentRepository.save(comment);

        return LocalDateTime.now();
    }
}
