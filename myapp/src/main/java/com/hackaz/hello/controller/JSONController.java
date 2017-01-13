package com.hackaz.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackaz.models.Contacts;

@Controller
@RequestMapping("hackaz/contacts")
public class JSONController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Contacts getContacts(@PathVariable String name) {
		System.out.println("Inside Json");
		Contacts contacts = new Contacts();
		contacts.setContactName(name);
		contacts.setContactNumber("839847");
		return contacts;
	}
}
