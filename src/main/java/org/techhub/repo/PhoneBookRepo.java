package org.techhub.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techhub.entity.PhoneBook;

public interface PhoneBookRepo extends JpaRepository<PhoneBook, Integer>{

}
