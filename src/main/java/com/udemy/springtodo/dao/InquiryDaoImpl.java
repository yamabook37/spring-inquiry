package com.udemy.springtodo.dao;

import com.udemy.springtodo.entity.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class InquiryDaoImpl implements InquiryDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public InquiryDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertInquiry(Inquiry inquiry) {
        jdbcTemplate.update("INSERT INTO inquiry(name, email, contents, created) VALUES(?, ?, ?, ?)",
                inquiry.getName(), inquiry.getEmail(), inquiry.getContents(), inquiry.getCreated());
    }

    public List<Inquiry> getAll() {
        String sql = "SELECT id ,name, email, contents, created FROM inquiry";
        // Mapで取得してList<inquiry>に詰め直す
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
        List<Inquiry> list = new ArrayList<Inquiry>();

        for(Map<String, Object> result : resultList) {
            Inquiry inquiry = new Inquiry();
            inquiry.setId((int)result.get("id"));
            inquiry.setName((String) result.get("name"));
            inquiry.setEmail((String) result.get("email"));
            inquiry.setContents((String) result.get("contents"));
            inquiry.setCreated(((Timestamp) result.get("created")).toLocalDateTime());
            list.add(inquiry);
        }
        return list;
    }
}
