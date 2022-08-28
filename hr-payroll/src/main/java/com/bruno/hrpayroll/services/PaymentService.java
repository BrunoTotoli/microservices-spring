package com.bruno.hrpayroll.services;

import com.bruno.hrpayroll.entities.Payment;
import com.bruno.hrpayroll.entities.Worker;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class PaymentService {

    private RestTemplate restTemplate;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = restTemplate.exchange("http://localhost:8081/workers/{id}", HttpMethod.GET, null, Worker.class, workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
