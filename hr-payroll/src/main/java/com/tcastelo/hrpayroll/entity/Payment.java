package com.tcastelo.hrpayroll.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {

    private Long id;
    private String name;
    private Double dailyIncome;
    private Integer days;
}
