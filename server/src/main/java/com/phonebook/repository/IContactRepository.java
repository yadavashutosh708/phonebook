package com.phonebook.repository;

import com.phonebook.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IContactRepository extends JpaRepository<ContactEntity, Long> {
    Optional<ContactEntity> findByEmail(String email);
}
