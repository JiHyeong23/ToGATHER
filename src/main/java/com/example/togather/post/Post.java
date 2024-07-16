package com.example.togather.post;

import com.example.togather.memberPost.MemberPost;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
    private Long likeCount;
    private Long CommentCount;
    @OneToMany(mappedBy = "post")
    private List<MemberPost> memberPost;

}
