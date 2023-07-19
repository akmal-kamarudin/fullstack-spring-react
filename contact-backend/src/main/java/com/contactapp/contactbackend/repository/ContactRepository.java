package com.contactapp.contactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contactapp.contactbackend.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
