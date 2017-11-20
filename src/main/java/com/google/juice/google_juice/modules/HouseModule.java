package com.google.juice.google_juice.modules;


import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.juice.google_juice.intf.Door;
import com.google.juice.google_juice.intf.Roof;
import com.google.juice.google_juice.intf.Window;

public class HouseModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Door.class).in(Singleton.class);
		bind(Window.class).in(Singleton.class);
		bind(Roof.class).in(Singleton.class);
	}
}