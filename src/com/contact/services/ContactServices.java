package com.contact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contact.DaoImpl.ContactDaoImpl;
import com.contact.model.Contact;




@Service
@Transactional
public class ContactServices {
	
	@Autowired
	private ContactDaoImpl contactDao;

	public String registerContact(Contact contact) {
		
		if(contactDao.registerContact(contact)== "success")
			return "success";
		else
		return "error";
	}

	
	public List<Contact> getContacts() {
		System.out.println("hello from ser get contacts");
		return contactDao.getContacts();
		
	}
	}


