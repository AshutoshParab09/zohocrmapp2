package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billings;
import com.zohocrm.entities.contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private  ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/ganerateBill")
	public String getContactId(@RequestParam("id")long id, ModelMap model) {
	contact contact = contactService.getOneContact(id);
	model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/saveBill") 
	public String saveBill(@ModelAttribute("bill") Billings bill) {
		billingService.saveBill(bill);
		return "generate_bill";
	}
}
