package main.java.com.example.deploy.controller;

import com.example.deploy.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @GetMapping("/login")
    public String login() { return "login"; }

    @PostMapping("/login")
    public String login(Member member, Model model) {
        String result = ("test".equals(member.getId()) && "1234".equals(member.getPass()))
                ? "로그인 성공!!" : "로그인 실패";
        model.addAttribute("result", result);
        return "loginResult";
    }

    @GetMapping("/signup")
    public String signup() { return "signup"; }

    @PostMapping("/signup")
    public String signup(Member member, Model model) {
        model.addAttribute("member", member);
        return "signupResult";
    }
}
