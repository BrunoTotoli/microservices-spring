package com.bruno.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal() {
        return days * dailyIncome;
    }
}
