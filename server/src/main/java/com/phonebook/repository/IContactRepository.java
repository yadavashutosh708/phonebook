package com.phonebook.repository;

import com.phonebook.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactRepository extends JpaRepository<ContactEntity, Long> {
}
