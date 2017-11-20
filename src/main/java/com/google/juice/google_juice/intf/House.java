package com.google.juice.google_juice.intf;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class House {
	private final Door door;
	private final Window window;

	public Door getDoor() {
		return door;
	}

	public Window getWindow() {
		return window;
	}

	public Roof getRoof() {
		return roof;
	}

	private final Roof roof;

	@Inject
	public House(Window window, Roof roof, Door door) {
		System.out.println(" house constructor called ");
		this.door = door;
		this.window = window;
		this.roof = roof;
	}
}