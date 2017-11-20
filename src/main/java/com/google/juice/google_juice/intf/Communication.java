package com.google.juice.google_juice.intf;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.juice.google_juice.annotation.MethodLoggingAnnotator;

public class Communication {

	private Communicator communicator;

	@Inject
	public Communication(@Named("DefautlComm") Communicator communicator) {
		this.communicator = communicator;
	}

	@MethodLoggingAnnotator
	public void sendMessage(String message) {
		communicator.sendMessage(message);
	}
}
