package com.phonebook.dto;

import com.phonebook.config.ContactType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailId;
    private ContactType role;
}
