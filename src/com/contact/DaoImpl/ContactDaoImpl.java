package com.contact.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.contact.model.Contact;



@Repository
public class ContactDaoImpl {

	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	public String registerContact(Contact contact) {
		sessionfactory.getCurrentSession().save(contact);
		System.out.println("in dao"+contact);
		return "success";
	}


	public List<Contact> getContacts() {
		System.out.println("hello from dao get contacts");
        List<Contact> list = sessionfactory.getCurrentSession().createQuery("From Contact").list();
    System.out.println(list);
    return list;
		
	}

}
