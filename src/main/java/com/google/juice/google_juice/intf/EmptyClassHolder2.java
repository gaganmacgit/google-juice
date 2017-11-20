package com.google.juice.google_juice.intf;

import com.google.inject.Inject;

public class EmptyClassHolder2 {

	@Inject
	private EmptyClass emptyClass;

	public EmptyClassHolder2() {
	}

	public void callMe() {
		System.out.println(emptyClass.hashCode());
	}

}
