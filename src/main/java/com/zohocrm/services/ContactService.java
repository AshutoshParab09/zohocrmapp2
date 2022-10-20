package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.contact;

public interface ContactService {
	public void saveOneLead(contact contact);

	public List<contact> getAllContacts();

	public contact getOneContact(long id);


}
