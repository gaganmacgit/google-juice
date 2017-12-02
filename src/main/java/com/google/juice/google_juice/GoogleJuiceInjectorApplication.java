package com.google.juice.google_juice;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.juice.google_juice.intf.Communication;
import com.google.juice.google_juice.intf.EmptyClassHolder1;
import com.google.juice.google_juice.intf.EmptyClassHolder2;
import com.google.juice.google_juice.intf.House;
import com.google.juice.google_juice.modules.AOPModule;
import com.google.juice.google_juice.modules.CommonGuiceModules;
import com.google.juice.google_juice.modules.HouseModule;
import com.google.juice.google_juice.service.CheckoutService;

public class GoogleJuiceInjectorApplication {

	public static void main(String[] args) {

		List<AbstractModule> modulesList = new ArrayList<AbstractModule>();
		// modulesList.add(new BasicModule());
		modulesList.add(new CommonGuiceModules());
		modulesList.add(new AOPModule());
		modulesList.add(new HouseModule());

		Injector injector = Guice.createInjector(modulesList);
		CheckoutService checkoutService = injector.getInstance(CheckoutService.class);
		checkoutService.checkout(100);
		checkoutService.checkout(400);
		Communication communication = injector.getInstance(Communication.class);
		communication.sendMessage(" Should be by SMS ");
		EmptyClassHolder1 instance1 = injector.getInstance(EmptyClassHolder1.class);
		EmptyClassHolder2 instance2 = injector.getInstance(EmptyClassHolder2.class);
		instance1.callMe();
		instance2.callMe();
		House house1 = injector.getInstance(House.class);
		House house2 = injector.getInstance(House.class);
		House house3 = injector.getInstance(House.class);
		House house4 = injector.getInstance(House.class);
		House house5 = injector.getInstance(House.class);
		House house6 = injector.getInstance(House.class);
		House house7 = injector.getInstance(House.class);
		
		// injector.getInstance(House.class);
		house1.getWindow().constructorMe();
	}
}
