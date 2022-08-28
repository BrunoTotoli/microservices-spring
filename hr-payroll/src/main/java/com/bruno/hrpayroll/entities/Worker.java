package com.bruno.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Worker implements Serializable {


    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private Double dailyIncome;


}
