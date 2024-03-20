package com.udemy.springtodo.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
