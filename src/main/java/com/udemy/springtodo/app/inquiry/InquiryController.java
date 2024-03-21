package com.udemy.springtodo.app.inquiry;

import com.udemy.springtodo.entity.Inquiry;
import com.udemy.springtodo.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    private final InquiryService inquiryService;

    @Autowired
    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping("/form")
    public String form(InquiryForm inquiryForm,
                       Model model,
                       @ModelAttribute("complete") String complete) {
        model.addAttribute("title", "Inquiry Form");
        return "inquiry/form";
    }

    @PostMapping("/form")
    public String formGoBack(InquiryForm inquiryForm, Model model) {
        model.addAttribute("title", "Inquiry Form");
        return "inquiry/form";
    }

    @PostMapping("/confirm")
    public String confirm(@Validated InquiryForm inquiryForm,
                          BindingResult result,
                          Model model) {
        if(result.hasErrors()) {
            model.addAttribute("title", "Inquiry Form");
            return "inquiry/form";
        }
        model.addAttribute("title", "Confirm Page");
        return "inquiry/confirm";
    }

    @PostMapping("/complete")
    public String confirm(@Validated InquiryForm inquiryForm,
                          BindingResult result,
                          Model model,
                          RedirectAttributes redirectAttributes) {
        if(result.hasErrors()) {
            model.addAttribute("title", "Inquiry Form");
            return "inquiry/form";
        }
        // save to database
        Inquiry inquiry = new Inquiry();
        inquiry.setName(inquiryForm.getName());
        inquiry.setEmail(inquiryForm.getEmail());
        inquiry.setContents(inquiryForm.getContents());
        inquiry.setCreated(LocalDateTime.now());

        inquiryService.save(inquiry);

        redirectAttributes.addFlashAttribute("complete", "Registered");
        return "redirect:/inquiry/form"; // htmlではなくurlを指示
    }

    @GetMapping
    public String index(Model model) {
        List<Inquiry> list = inquiryService.getAll();

        model.addAttribute("inquiryList", list);
        model.addAttribute("title", "Inquiry Index");
        return "inquiry/index";
    }
}
