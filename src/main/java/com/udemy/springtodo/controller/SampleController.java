package com.udemy.springtodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/sample")
public class SampleController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SampleController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/test")
    public String sample(Model model) {

        String sql = "SELECT id, name, email "
                + "FROM inquiry WHERE id = 1";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);
        System.out.println(map.get("name"));
        System.out.println(map.get("email"));

        model.addAttribute("title", "Inquiry Form");
        model.addAttribute("name", map.get("name"));
        model.addAttribute("email", map.get("email"));
        return "test";
    }
}


