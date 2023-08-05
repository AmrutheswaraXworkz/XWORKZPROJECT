package association.example.app.constructor;

public class RouterWifi extends Router {
	public RouterWifi() {
		// TODO Auto-generated constructor stub
		super('M', "Wifi", 20, true);
	}
	
	public RouterWifi(char size,String routerName,double internetSpeed,boolean supportsWirelessconnection) {
		super(size, routerName, internetSpeed, supportsWirelessconnection);
	}
}
