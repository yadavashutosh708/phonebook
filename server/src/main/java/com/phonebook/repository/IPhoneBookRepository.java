package com.phonebook.repository;

import com.phonebook.entity.PhoneBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneBookRepository extends JpaRepository<PhoneBookEntity, Long> {
}
