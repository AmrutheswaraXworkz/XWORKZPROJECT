package com.xworkz.association.boot;

import com.xworkz.association.app.Bluetooth;
import com.xworkz.association.impl.Mobile;
import com.xworkz.association.impl.Speaker;

public class SpeakerMain {
	final int a;
	
	SpeakerMain(int a){
		this.a=a;
	}
	public static void main(String[] args) {
		Bluetooth bluetooth = new Mobile();

		Speaker speaker = new Speaker();
		speaker.setBluetooth(bluetooth);
		speaker.wirelessConnect();
		
		SpeakerMain s=new SpeakerMain(10);	
		System.out.println(s.a);
		SpeakerMain a=new SpeakerMain(25);
		System.out.println(a.a);
		
		
	}

}
