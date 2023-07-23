public class MainFile{
	public static void main(String[] args){
		
		Brick brick=new Brick("rectangle","construction");
		Brick.brickStaticMethod();
		brick.brickInstanceMethod();
		System.out.println();
		
		Candle candle=new Candle('M',10);
		Candle.candleStatic();
		candle.candleInstance();
		System.out.println();
		
		Helmet helmet=new Helmet(1000,'m');
		Helmet.helmetStatic();
		helmet.helmetInstance();
		System.out.println();
		
		Soil soil=new Soil("red","minerals");
		soil.soilInstance();
		Soil.soilStatic();
		
		ButterFly butterfly = new ButterFly(2, "Inside  Body");
		butterfly.instanceVarMethod();
		ButterFly.staticVarMethod();
		System.out.println("\n");
		
		Power power = new Power("Physical", "Activity");
		power.instanceVarMethod();
		Power.staticVarMethod();
		System.out.println("\n");
		
		Bureau bureau = new Bureau(2, 'M');
		bureau.instanceVarMethod();
		Bureau.staticVarMethod();
	}
		
	
}