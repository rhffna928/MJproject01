package com.mj.member.repository;

import org.springframework.stereotype.Repository;
import com.mj.member.dto.MemberDTO;

@Repository
public class MemberRepository {

    public int save(MemberDTO memberDTO){
        System.out.println("memberDTO = " + memberDTO);
        return 0;
    }
}
