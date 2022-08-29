package com.bruno.hrpayroll.controller;

import com.bruno.hrpayroll.entities.Payment;
import com.bruno.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable long workerId, @PathVariable Integer days) {
        return ResponseEntity.ok(paymentService.getPayment(workerId, days));
    }

    public ResponseEntity<Payment> getPaymentAlternative(long workerId, Integer days) {
        Payment payment = new Payment("Brann", 400.0, days);
        return ResponseEntity.ok(payment);
    }

}
