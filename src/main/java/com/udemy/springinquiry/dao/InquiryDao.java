package com.udemy.springinquiry.dao;

import com.udemy.springinquiry.entity.Inquiry;
import java.util.List;

public interface InquiryDao {

    void insertInquiry(Inquiry inquiry);

    List<Inquiry> getAll();

    int updateInquiry(Inquiry inquiry);
}
