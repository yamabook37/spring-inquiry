package com.udemy.springtodo.dao;

import com.udemy.springtodo.entity.Inquiry;
import java.util.List;

public interface InquiryDao {

    void insertInquiry(Inquiry inquiry);

    List<Inquiry> getAll();
}
