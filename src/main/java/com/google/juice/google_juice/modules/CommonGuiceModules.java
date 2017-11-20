package com.google.juice.google_juice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.juice.google_juice.intf.Discountable;
import com.google.juice.google_juice.intf.EarlyBirdDiscount;
import com.google.juice.google_juice.service.CheckoutService;

public class CommonGuiceModules extends AbstractModule {

	@Override
	protected void configure() {
		bind(Discountable.class).to(EarlyBirdDiscount.class).in(Singleton.class);
		bind(CheckoutService.class).in(Singleton.class);
		install(new BasicModule());
	}

}
