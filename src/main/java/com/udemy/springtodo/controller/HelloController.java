package com.udemy.springtodo.controller;

import com.udemy.springtodo.entity.Member;
import com.udemy.springtodo.service.MemberServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String hello() {

//        MemberServiceImpl service = MemberServiceImpl.getInstance();
//        System.out.println(service.greet(2));
//        System.out.println(service.getAll());
//        ArrayList<Member> list = service.getAll();
//        for(Member mem : list) {
//            System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
//        }

        return "index";
    }

}
