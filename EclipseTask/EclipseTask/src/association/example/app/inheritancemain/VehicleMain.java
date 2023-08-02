package association.example.app.inheritancemain;

import association.example.app.inheritance.*;

public class VehicleMain {
		public static void main(String[] args) {
			Vehicle vh=new Car();
			vh.vehicle();
			System.out.println("vehicle type is:"+vh.vehicle);
			System.out.println();
			
			Vehicle car=new Vehicle();
			car.vehicle();
			System.out.println("vehicle type is:"+car.vehicle);
			System.out.println();
			
			Car window=new Windows();
			window.car();
			System.out.println("type of car is:"+window.vehicle);
			System.out.println();
			
			Car wheels=new Wheels();
			wheels.car();
			System.out.println("type of car is:"+wheels.cName);
			System.out.println();
			
			Wheels wh=new Tyres();
			wh.wheels();
			System.out.println("number of wheels:"+wh.wheelNo);
			System.out.println();
			
			Tyres ty=new GasType();
			ty.tyres();
			System.out.println("type of gas is:"+ty.tyreType);
			System.out.println();
			
			Windows win =new Windows();
			win.windows();
			System.out.println("number of windowa:"+win.wNo);
			
			
		}
}
