package com.udemy.springtodo.service;

import com.udemy.springtodo.entity.Inquiry;
import java.util.List;

public interface InquiryService {

    void save(Inquiry inquiry);

    void update(Inquiry inquiry);

    List<Inquiry> getAll();
}
