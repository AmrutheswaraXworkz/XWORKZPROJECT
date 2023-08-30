package com.xworkz.association.app;

public class User {
	
		private Internet internet;
		private Wifi wifi=new Wifi();
		
		public void connect() {
			System.out.println("browser uses internet");
			this.internet.connect();
		}
		
		public void setInternet(Internet internet) {
			this.internet=internet;
			System.out.println("Internet:"+internet);
		}
		
		public void connectMethodInTightCoupling() {
			System.out.println("Wifi instantiation using tight coupling");
			this.wifi.connect();
		}
		
		public void setWifi(Wifi wifi) {
			this.wifi=wifi;
			System.out.println("tight coupling:"+wifi);
		}
		
	}


