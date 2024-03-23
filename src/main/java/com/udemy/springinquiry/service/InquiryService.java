package com.udemy.springinquiry.service;

import com.udemy.springinquiry.entity.Inquiry;
import java.util.List;

public interface InquiryService {

    void save(Inquiry inquiry);

    void update(Inquiry inquiry);

    List<Inquiry> getAll();
}
