package com.ecommerce.couponservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.couponservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
