package com.contact.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contact.model.Contact;
import com.contact.services.ContactServices;


@Controller
public class ContactController {
	
	
	@Autowired
	private ContactServices service;
		
	
/*	@RequestMapping(value = "/registerContact" , method=RequestMethod.POST)
	public @ResponseBody String registerContact(String name, String email ,  String contactNumber)
	{
		
	
		System.out.println(name + email + contactNumber);
		Contact contact=new Contact(name, email ,contactNumber);
		
		
		service.registerContact(contact);
		return "your data is saved";
	}*/
	
	@RequestMapping(value = "/registerContact" , method=RequestMethod.POST)
	public @ResponseBody String registerContact(@RequestBody Contact contact)
	{
		System.out.println(contact);
		service.registerContact(contact);
		return "Data Added Successfully";
	}
	
	
	
	@RequestMapping(value = "/getContacts" , method=RequestMethod.GET)
	public @ResponseBody List<Contact> getContacts() {
		
		System.out.println("hello get contacts");
		List list = service.getContacts();
		System.out.println(list);
		return list;
	}
	
	
	}


