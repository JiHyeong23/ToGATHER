package com.example.togather.member;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService {

    private MemberRepository memberRepository;
    private MemberMapper memberMapper;

    public String saveMember(JoinMemberDto joinMemberDto) {
        System.out.println(joinMemberDto.getName());
        System.out.println(joinMemberDto.getEmail());
        Member member = memberMapper.joinDtoToMember(joinMemberDto);
        System.out.println(member.getName());
        System.out.println(member.getEmail());
        memberRepository.save(member);
        return member.getName();
    }
}
