package com.google.juice.google_juice.intf;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class Window {

	@Inject
	private Injector injector;

	public Window() {
		System.out.println(" Window constructor called ");
	}

	public void constructorMe() {
		Roof roofInstance = injector.getInstance(Roof.class);
		System.out.println(roofInstance.roofType);
	}
}
