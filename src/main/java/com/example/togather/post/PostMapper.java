package com.example.togather.post;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {

    Post saveDtoToPost(SavePostDto savePostDto);
}
