package org.techhub.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.techhub.entity.PhoneBook;
import org.techhub.service.PhoneBookService;

@RestController
public class PhoneBookCtrl {

	@Autowired
	private PhoneBookService bookservice;

    private static final Logger logger = LoggerFactory.getLogger(PhoneBookCtrl.class);

	@PostMapping("/save-contact")
	public ResponseEntity<PhoneBook> addContact(@RequestBody PhoneBook book) {

		logger.info("AddContact() called::");
		PhoneBook bk = bookservice.addContact(book);

		return new ResponseEntity<>(bk, HttpStatus.CREATED);

	}

	@GetMapping("/get")
	public List<PhoneBook> getPhoneBook() {

		return bookservice.getPhoneBook();

	}

	@PostMapping("/update")
	public ResponseEntity<PhoneBook> updateContact(@RequestBody PhoneBook book) {

		PhoneBook bk = bookservice.updatePhoneBook(book);

		return new ResponseEntity<>(bk, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteContact(@PathVariable("id") Integer id) {
		return bookservice.deleteContact(id);
	}

}
