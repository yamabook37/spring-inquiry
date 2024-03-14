package com.udemy.springtodo.service;

import com.udemy.springtodo.entity.Member;
import java.util.ArrayList;

public class MemberServiceImpl implements MemberService {

    @Override
    public String greet(int i) {
        String[] greetings = {"Good morning", "Hello", "Good evening"};
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        Member member1 = new Member(1, "Minami", "minami@sample.com");
        Member member2 = new Member(2, "Mai", "mai@sample.com");
        list.add(member1);
        list.add(member2);
        return list;
    }
}