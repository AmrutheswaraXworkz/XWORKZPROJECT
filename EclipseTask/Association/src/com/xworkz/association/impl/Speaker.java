package com.xworkz.association.impl;

import com.xworkz.association.app.Bluetooth;

public class Speaker {
private Bluetooth bluetooth;
	
	public void wirelessConnect() {
		System.out.println("Calling method method in Speaker Class.....");
		this.bluetooth.wirelessConnect();
	}
	
	public void setBluetooth(Bluetooth bluetooth) {
		this.bluetooth = bluetooth;
	}

}
