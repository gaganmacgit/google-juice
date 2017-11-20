package com.google.juice.google_juice.intf;

import com.google.inject.Inject;

public class EmptyClassHolder1 {

	@Inject
	private EmptyClass emptyClass;

	public EmptyClassHolder1() {
	}
	
	public void callMe() {
		System.out.println(emptyClass.hashCode());
	}
}
