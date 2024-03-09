package com.phonebook.service.impl;

import com.phonebook.entity.ContactEntity;
import com.phonebook.repository.IContactRepository;
import com.phonebook.service.IContactService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactService implements IContactService {
    IContactRepository iContactRepository;
    @Override
    public void createContact() {
        ContactEntity contact = new ContactEntity(0,"Ashu","Yadav","+91-9867748242","a@email.com");
        iContactRepository.save(contact);
    }
}
