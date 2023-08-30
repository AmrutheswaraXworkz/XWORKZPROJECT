package com.xworkz.association.impl;

import com.xworkz.association.app.Messenger;

public class Reciever {
private Messenger messenger;
	
	public void send() {
		System.out.println("invoking method in receiver class....");
		this.messenger.sendMsg();
	}
	
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

}
