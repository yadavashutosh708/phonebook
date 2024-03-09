package com.phonebook.service;

public interface IJwtService {
    String getUsername(String jwt);

    String getPasswordHash(String jwt);
}
