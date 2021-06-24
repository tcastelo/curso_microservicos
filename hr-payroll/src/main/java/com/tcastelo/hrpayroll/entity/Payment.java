package com.tcastelo.hrpayroll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String name;
    private Double dailyIncome;
    private Integer days;
}
