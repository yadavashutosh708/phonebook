package com.phonebook.mapper;

import com.phonebook.dto.ContactDto;
import com.phonebook.entity.ContactEntity;

public class ContactMapper {
    public static ContactDto mapToContactDto(ContactEntity contact){
        return new ContactDto(
                contact.getId(),
                contact.getFirstName(),
                contact.getLastName(),
                contact.getPhoneNumber(),
                contact.getEmailId(),
                contact.getRole());
    }

    public static ContactEntity mapToEmployee(ContactDto contactDto){
        return new ContactEntity(
                contactDto.getId(),
                contactDto.getFirstName(),
                contactDto.getLastName(),
                contactDto.getPhoneNumber(),
                contactDto.getEmailId(),
                contactDto.getRole());

    }
}
