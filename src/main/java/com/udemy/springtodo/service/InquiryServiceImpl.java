package com.udemy.springtodo.service;

import com.udemy.springtodo.dao.InquiryDao;
import com.udemy.springtodo.entity.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryServiceImpl implements InquiryService {
    // @Serviceをつけるとシングルトンとして自動的にインスタンス化される

    public final InquiryDao dao;

    @Autowired InquiryServiceImpl(InquiryDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Inquiry inquiry) {
        dao.insertInquiry(inquiry);
    }

    @Override
    public void update(Inquiry inquiry) {
        if(dao.updateInquiry(inquiry) == 0) {
            throw new InquiryNotFoundException("can't find the same ID");
        }
    }

    @Override
    public List<Inquiry> getAll() {
        return dao.getAll();
    }

}
