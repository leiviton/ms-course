package com.leiviton.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.leiviton.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Leiviton",200.0, days);
	}

}
