package com.udemy.springinquiry.service;

import com.udemy.springinquiry.entity.Member;
import java.util.ArrayList;

public interface MemberService {

    String greet(int i);

    ArrayList<Member> getAll();

}
