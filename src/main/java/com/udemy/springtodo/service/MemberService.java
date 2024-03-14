package com.udemy.springtodo.service;

import com.udemy.springtodo.entity.Member;
import java.util.ArrayList;

public interface MemberService {

    String greet(int i);

    ArrayList<Member> getAll();

}
