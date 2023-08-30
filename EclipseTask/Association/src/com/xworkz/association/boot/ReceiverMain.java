package com.xworkz.association.boot;

import com.xworkz.association.app.Messenger;
import com.xworkz.association.impl.Reciever;
import com.xworkz.association.impl.Sender;

public class ReceiverMain {
	public static void main(String[] args) {
		Messenger messenger = new Sender();

		Reciever reciever = new Reciever();
		reciever.setMessenger(messenger);
		reciever.send();
	}

}
