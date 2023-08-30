package com.xworkz.association.boot;

import com.xworkz.association.app.Computer;
import com.xworkz.association.impl.OS;
import com.xworkz.association.impl.Programmer;

public class ProgrammerMain {
	public static void main(String[] args) {
		Computer computer = new OS();

		Programmer programmer = new Programmer();
		programmer.setComputer(computer);
		programmer.operate();

	}

}
