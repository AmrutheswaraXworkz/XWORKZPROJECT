package association.example.app.constructor;

public class Router {
	public char size;
	public String routerName;
	public double internetSpeed;
	public boolean supportsWirelessconnection;
	
	public Router(char size,String routerName,double internetSpeed,boolean supportsWirelessconnection) {
		// TODO Auto-generated constructor stub
		this.internetSpeed = internetSpeed;
		this.routerName = routerName;
		this.size = size;
		this.supportsWirelessconnection = supportsWirelessconnection;
	}

}
