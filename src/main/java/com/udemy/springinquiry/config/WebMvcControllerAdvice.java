package com.udemy.springinquiry.config;

import com.udemy.springinquiry.service.InquiryNotFoundException;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WebMvcControllerAdvice {

    // 送信された空文字をあらかじめnullに変換する
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public String handleException(EmptyResultDataAccessException e, Model model) {
        model.addAttribute("message", e);
        return "error/CustomPage";
    }

    // 全てのcontrollerで発生した例外をキャッチする
    @ExceptionHandler(InquiryNotFoundException.class)
    public String handleException(InquiryNotFoundException e, Model model) {
        model.addAttribute("message", e);
        return "error/CustomPage";
    }
}
