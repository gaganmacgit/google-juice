package com.google.juice.google_juice.intf;

public class DefaultCommunicator implements Communicator {

	public void sendMessage(String message) {
		System.out.println( " message =>"+ message + " sent via default implementation ");
	}

}
