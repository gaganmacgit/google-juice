package com.google.juice.google_juice.intf;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class EmptyClass {

	@Inject
	public EmptyClass(@Height int height) {
		System.out.println(" constructor called for " + this.getClass().getName() + "  =>"+ height);
	}

}
