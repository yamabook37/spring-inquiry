package com.udemy.springinquiry.app.inquiry;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InquiryForm {

    @Size(min = 1, max = 20, message = "Please input 20 characters or less")
    private String name;

    @NotNull
    @Email(message = "Invalid email format")
    private String email;

    @NotNull
    private String contents;


    // デフォルトコンストラクタ
    public InquiryForm() {
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContents() {
        return contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
