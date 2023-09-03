package com.xworkz.chandrayana.boot;

import com.xworkz.chandrayana.app.repository.JacketRepositoryImpl;

public class JacketRunner {
	public static void main(String[] args) {
		JacketRepositoryImpl jacket=new JacketRepositoryImpl();
		String[] styles= {"denim","jeans","cotton","woolen"};
		for(int a=0;a<styles.length;a++) {
			jacket.style(styles[a]);
			
		}
	}

}
