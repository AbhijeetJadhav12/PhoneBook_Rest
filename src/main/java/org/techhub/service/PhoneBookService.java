package org.techhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.entity.PhoneBook;
import org.techhub.repo.PhoneBookRepo;

@Service
public class PhoneBookService {

	@Autowired
	private PhoneBookRepo bookRepo;

	public PhoneBook addContact(PhoneBook book) {

		return bookRepo.save(book);

	}

	public List<PhoneBook> getPhoneBook() {
		return bookRepo.findAll();
	}

	public PhoneBook updatePhoneBook(PhoneBook book) {

		return bookRepo.save(book);

	}

	public boolean deleteContact(Integer id) {
		bookRepo.deleteById(id);
		if (bookRepo.findById(id) != null) {
			return true;
		} else {
			return false;
		}
	}

}
