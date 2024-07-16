package com.example.togather.member;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@AllArgsConstructor
public class MemberController {

    private MemberService memberService;
    @PostMapping("/join")
    public ResponseEntity joinMember(@RequestBody JoinMemberDto joinMemberDto) {
        String memberName = memberService.saveMember(joinMemberDto);

        return ResponseEntity.ok().body("Welcome, " + memberName);
    }
}
