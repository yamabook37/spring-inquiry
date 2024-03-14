package com.udemy.springtodo.controller;

import com.udemy.springtodo.entity.Member;
import com.udemy.springtodo.service.MemberServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public  String hello() {

        //MemberServiceImpl service = new MemberServiceImpl();
        MemberServiceImpl service = MemberServiceImpl.getInstance();
        System.out.println(service.greet(2));
        System.out.println(service.getAll());
        ArrayList<Member> list = service.getAll();
        for(Member mem : list) {
            System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
        }

        return "Hello world!!";
    }

}
