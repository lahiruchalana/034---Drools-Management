package com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentTypeOffer {

    private String paymentMethod;
    private Integer offer;
    private Integer userId;

}
