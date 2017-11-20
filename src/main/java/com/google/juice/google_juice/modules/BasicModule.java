package com.google.juice.google_juice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import com.google.juice.google_juice.intf.Communicator;
import com.google.juice.google_juice.intf.Height;
import com.google.juice.google_juice.intf.SMSCommunicator;

public class BasicModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Communicator.class).annotatedWith(Names.named("DefautlComm")).to(SMSCommunicator.class)
				.in(Singleton.class);
//		bind(EmptyClass.class).toInstance(new EmptyClass());
		bindConstant().annotatedWith(Height.class).to(40);
	}

}
