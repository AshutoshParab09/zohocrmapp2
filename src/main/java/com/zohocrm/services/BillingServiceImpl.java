package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billings;
import com.zohocrm.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billings bill) {
		billingRepo.save(bill);
		
	}

}
