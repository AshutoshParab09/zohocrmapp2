package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Billings;

public interface BillingRepository extends JpaRepository<Billings, Long> {

}
