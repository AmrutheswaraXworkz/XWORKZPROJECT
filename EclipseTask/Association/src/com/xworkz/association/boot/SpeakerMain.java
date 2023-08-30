package com.xworkz.association.boot;

import com.xworkz.association.app.Bluetooth;
import com.xworkz.association.impl.Mobile;
import com.xworkz.association.impl.Speaker;

public class SpeakerMain {
	public static void main(String[] args) {
		Bluetooth bluetooth = new Mobile();

		Speaker speaker = new Speaker();
		speaker.setBluetooth(bluetooth);
		speaker.wirelessConnect();
	}

}
