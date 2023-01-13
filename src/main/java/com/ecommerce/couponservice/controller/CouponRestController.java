package com.ecommerce.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.couponservice.model.Coupon;
import com.ecommerce.couponservice.repo.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	CouponRepo couponRepo;
	
	@RequestMapping(value = "/coupons", method = RequestMethod.POST,  consumes= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepo.save(coupon);
	}
	
	@RequestMapping(value = "/cupons/{code}", method = RequestMethod.GET )
	public Coupon getCoupon (@PathVariable("code") String code) {
		return couponRepo. findByCode(code);
	}
}
