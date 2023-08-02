package association.example.app.inheritancemain;

import association.example.app.inheritance.*;

public class BajajMain {
			public static void main(String[] args) {
				System.out.println("invokin main in BajajMain");
				Bajaj bajaj=new Bike();
				bajaj.bajaj();
				System.out.println("name of the bike is:"+bajaj.name);
				System.out.println();
				
				Bike bike=new Pulser();
				bike.bike();
				System.out.println("type of vehicle is:"+bike.type);
				System.out.println();
				
				Pulser speed=new Pulser();
				speed.pulser();
				System.out.println("model of the bike is:"+speed.model);
				System.out.println();
				
				Pulser goodSpeed=new Pulser();
				goodSpeed.pulser();
				System.out.println("model of the bike is:"+goodSpeed.model);
				System.out.println();
				
				Pulser200 work=new Engine();
				work.pulser200();
				System.out.println("model of the bike is:"+work.bikeName);
				System.out.println();
				
				Engine engine=new EngineType();
				engine.engine();
				System.out.println("engine number is:"+engine.engineNo);
				System.out.println();
				
				EngineType type=new EngineType();
				type.enginType();
				System.out.println("type of engine is:"+type.engineType);
				
				
			}
}
