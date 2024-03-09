package com.phonebook.controller;

import com.phonebook.service.IContactService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
@AllArgsConstructor
public class ContactController {
    IContactService iContactService;
    @PostMapping("/")
    public void createContact(){
        iContactService.createContact();
    }
}
