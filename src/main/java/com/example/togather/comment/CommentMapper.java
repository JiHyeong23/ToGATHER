package com.example.togather.comment;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    Comment SaveDtoToComment(SaveCommentDto saveCommentDto);
}
