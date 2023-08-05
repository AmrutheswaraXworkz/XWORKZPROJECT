package association.example.boot;

import association.example.app.constructor.RouterWifi;

public class RouterMain {
public static void main(String[] args) {
	RouterWifi routerWifi = new RouterWifi();
	System.out.println("No arguments");
	System.out.println(routerWifi.internetSpeed);
	System.out.println(routerWifi.routerName);
	System.out.println(routerWifi.size);
	System.out.println(routerWifi.supportsWirelessconnection);
	
	RouterWifi routerWifi2 = new RouterWifi('M',"Internet Router",30,true);
	System.out.println("parameter arguments");
	System.out.println(routerWifi2.internetSpeed);
	System.out.println(routerWifi2.routerName);
	System.out.println(routerWifi2.size);
	System.out.println(routerWifi2.supportsWirelessconnection);
}
}
