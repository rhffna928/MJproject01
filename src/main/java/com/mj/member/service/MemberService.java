package com.mj.member.service;

import com.mj.member.dto.MemberDTO;
import com.mj.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public int save(MemberDTO memberDTO){
        return memberRepository.save(memberDTO);
    }
}
