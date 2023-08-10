package com.example.encapsulation.boot;

import com.example.encapsulation.app.Pubg;

public class PubgMain {

	public static void main(String[] args) {
		
		Pubg pubg=new Pubg();
		
		pubg.setPlayerName("NANDINI");
		System.out.println(pubg.getPlayerName());
		
		pubg.setNumHealthKits(10);
		System.out.println(pubg.getNumHealthKits());
		
		pubg.setPlayerArmor(15);
		System.out.println(pubg.getPlayerArmor());
		
		pubg.setPlayerAmmo(20);
		System.out.println(pubg.getPlayerAmmo());
		
		pubg.setISPlayerAlive(true);
		System.out.println(pubg.isPlayerAlive());
		
		pubg.setEquippedWeapon("GUN");
		System.out.println(pubg.getEquippedWeapon());
		
		pubg.setWeaponDamage(16);
		System.out.println(pubg.getWeaponDamage());
		
		pubg.setWeaponAmmo(26);
		System.out.println(pubg.getWeaponAmmo());
		
		pubg.setIsWeaponEquipped(true);
		System.out.println(pubg.isWeaponEquipped());
		
		pubg.setCurrentMap("Forest");
		System.out.println(pubg.getCurrentMap());
		
		pubg.setCircleRadius(7);
		System.out.println(pubg.getCircleRadius());
		
		pubg.setRemainingPlayers(17);
		System.out.println(pubg.getRemainingPlayers());
		
		pubg.setIsMatchInProgress(true);
		System.out.println(pubg.isMatchInProgress());
		
		pubg.setMatchDuration(10);
		System.out.println(pubg.getMatchDuration());
		
		pubg.setIsFinalCircle(false);
		System.out.println(pubg.isFinalCircle());

	}

}
