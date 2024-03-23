package com.udemy.springinquiry.service;

public class InquiryNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    // デフォルトコンストラクタ, 親クラスに渡す
    public InquiryNotFoundException(String message) {
        super(message);
    }
}
