package com.mj.member.controller;

import com.mj.member.dto.MemberDTO;
import com.mj.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    //@GetMapping("/member/save") //RequestMapping을 사용해서 /member를 스킵할 수 있다./
    @GetMapping("/save")
    public String saveForm(){
       return "/save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){

        int saveResult = memberService.save(memberDTO);

        if (saveResult > 0){
            return "/login";
        }else{
            return "/save";
        }
    }

}
