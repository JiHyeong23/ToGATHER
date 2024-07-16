package com.example.togather.member;

import com.example.togather.memberPost.MemberPost;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String pw;
    private LocalDateTime joinTime;
    private LocalDateTime lastLogin;
    @OneToMany(mappedBy = "member")
    private List<MemberPost> posts;
}
