package association.example.implement.boot;
import association.example.implement.app.EngineerImplement;
import association.example.implement.app.MetroImplement;
import association.example.implement.app.MilitaryImplement;
import association.example.implement.app.PGImplement;
import association.example.implement.app.TempleImplement;

public class ImplementMain {
public static void main(String[] args) {
	MetroImplement metroImplement=new MetroImplement();
	metroImplement.route();
	metroImplement.silence(false);
	metroImplement.ticket(0);
	metroImplement.train(10);
	metroImplement.time();
	
	System.out.println("==========================");
	TempleImplement templeImplement=new TempleImplement();
	templeImplement.bath();
	templeImplement.darshana();
	templeImplement.kanike();
	templeImplement.queue();
	templeImplement.shirt();
	
	System.out.println("++++++++++++++++++++++++++");
	PGImplement pgImplement=new PGImplement();
	pgImplement.advance(0);
	pgImplement.drinking(false);
	pgImplement.rent(0);
	pgImplement.smoking(false);
	pgImplement.timings();
	
	System.out.println("---------------------------");
	EngineerImplement engineerImplement=new EngineerImplement();
	engineerImplement.attendence();
	engineerImplement.decency(false);
	engineerImplement.dress(false);
	engineerImplement.fees(0);
	engineerImplement.marks(0);
	
	System.out.println(":::::::::::::::::::::::::::");
	MilitaryImplement militaryImplement=new MilitaryImplement();
	militaryImplement.eyeSight();
	militaryImplement.hairStyle();
	militaryImplement.height();
	militaryImplement.qualification();
	militaryImplement.weight();
	
	
	
}
}
