package com.google.juice.google_juice.intf;

public class SMSCommunicator implements Communicator {

	public void sendMessage(String message) {
		System.out.println(" message =>" + message + " sent via SMSCommunicator implementation ");
	}

}
