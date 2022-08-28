package com.bruno.hrpayroll.services;

import com.bruno.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Bob", 200.0D, days);
    }

}
