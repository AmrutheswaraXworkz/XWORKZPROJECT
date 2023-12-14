package com.xworkz.dto.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.RobotDTO;

public class RobotRunner {

	public static void main(String[] args) {
		RobotDTO robo=new RobotDTO("Chitti", "1.O", 170, "TamilNadu");
		RobotDTO robo1=new RobotDTO("Chitti", "2.O", 165, "Chennai");
		RobotDTO robo2=new RobotDTO("Upendra", "Hollywood", 180, "Banglore");
		RobotDTO robo3=new RobotDTO("Matrix", "21.O", 150, "Davangere");
		RobotDTO robo4=new RobotDTO("MultiThread", "Java Multi.O", 185, "California");
		
		Collection<RobotDTO> robos=new LinkedList<RobotDTO>();
		robos.add(robo);
		robos.add(robo1);
		robos.add(robo2);
		robos.add(robo3);
		robos.add(robo4);
		
		robos.stream().sorted().forEach(c->System.out.println(c));
		
	}
}
