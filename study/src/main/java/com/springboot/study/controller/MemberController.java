package com.springboot.study.controller;


import com.springboot.study.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/login") --> ModelAndView 객체를 활용하여 데이터 및 view 전송
//    public ModelAndView login(@RequestParam String id, @RequestParam String pass) {
//        ModelAndView model = new ModelAndView();
//        String result = "";
//        if(id.equals("test") && pass.equals("1234")) result= "[ModelAndView]로그인 성공!!";
//        else result ="[ModelAndView]로그인 실패";
//        model.addObject("result",result);
//        model.setViewName("loginResult");
//        return model;
//    }

    @PostMapping("/login")
    public String login(Member member, Model model) {
        String result = "";
        if(member.getId().equals("test") && member.getPass().equals("1234")) result= "로그인 성공!!";
        else result ="로그인 실패";

        model.addAttribute("result",result);

        return "loginResult";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(Member member, Model model) {
        model.addAttribute("member", member);
        return "signupResult";
    }

}
