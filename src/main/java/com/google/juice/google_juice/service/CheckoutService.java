package com.google.juice.google_juice.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.inject.Inject;
import com.google.juice.google_juice.intf.Discountable;
import com.google.juice.google_juice.intf.EmptyClass;

public class CheckoutService {

	private final Discountable discountable;

	Logger logger;
	
	@Inject
	private EmptyClass emptyClass;

	@Inject
	public CheckoutService(Discountable discountable,Logger logger) {
		super();
		this.logger = logger;
		logger.log(Level.INFO, " Constructor called for " + this.getClass().getName());
		this.discountable = discountable;
	}

	public void checkout(double shoppingCartAmount) {

		double discountedPride = shoppingCartAmount - (shoppingCartAmount * discountable.getDiscount());
		logger.log(Level.INFO, " the discounted price is {} ", discountedPride);

	}
}
