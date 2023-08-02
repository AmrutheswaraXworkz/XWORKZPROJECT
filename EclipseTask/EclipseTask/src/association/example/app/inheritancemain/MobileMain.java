package association.example.app.inheritancemain;

import association.example.app.inheritance.*;

public class MobileMain {
	public static void main(String[] args) {
		Mobile net=new Internet();
		net.mobile();
		System.out.println("name of the mobile is:"+net.mobileName);
		System.out.println();
		Internet application=new App();
		application.internet();
		System.out.println("name of the sim is:"+application.sim);
		System.out.println();
		App watsapp=new WatsApp();
		watsapp.app();
		System.out.println("name of the application is:"+watsapp.appName);
		System.out.println();
		WatsApp chat=new Chat();
		chat.watsApp();
		System.out.println("we can do:"+chat.WatApp);
		System.out.println();
		Chat info=new Info();
		info.chat();
		System.out.println("we can tttransfer info from chat");
	}

}
