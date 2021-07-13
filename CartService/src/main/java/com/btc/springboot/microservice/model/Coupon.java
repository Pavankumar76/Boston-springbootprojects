package com.btc.springboot.microservice.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon 
{
	private String couponCode;
	private double discount;
	private LocalDate validTill;
	private double minimumOrderAmount;
	private double maxDiscount;
	

}
