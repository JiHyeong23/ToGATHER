package com.example.togather.member;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member joinDtoToMember(JoinMemberDto joinMemberDto);
}
