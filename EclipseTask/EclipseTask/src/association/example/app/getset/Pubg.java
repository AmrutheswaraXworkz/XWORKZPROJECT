package com.example.encapsulation.app;

public class Pubg {
	 	private String playerName;
	    private int numHealthKits;
	    private int playerArmor;
	    private int playerAmmo;
	    private boolean isPlayerAlive;
	    
	    private String equippedWeapon;
	    private int weaponDamage;
	    private int weaponAmmo;
	    private boolean isWeaponEquipped;
	    
	    private String currentMap;
	    private int circleRadius;
	    private int remainingPlayers;

	    private boolean isMatchInProgress;
	    private int matchDuration;
	    private boolean isFinalCircle;
	    
	    public String getPlayerName()
	    {
	    	return this.playerName;
	    }
	    
	    public void setPlayerName(String playerName)
	    {
	    	this.playerName=playerName;
	    }
	    
	    public int getNumHealthKits()
	    {
	    	return this.numHealthKits;
	    }
	    
	    public void setNumHealthKits(int numHealthKits)
	    {
	    	this.numHealthKits=numHealthKits;
	    }
	    
	    public int getPlayerArmor()
	    {
	    	return this.playerArmor;
	    }
	    
	    public void setPlayerArmor(int playerArmor)
	    {
	    	this.playerArmor=playerArmor;
	    }
	    
	    public int getPlayerAmmo()
	    {
	    	return this.playerAmmo;
	    }
	    
	    public void setPlayerAmmo(int playerAmmo)
	    {
	    	this.playerAmmo=playerAmmo;
	    }
	    
	    public boolean isPlayerAlive()
	    {
	    	return this.isPlayerAlive;
	    }
	    
	    public void setISPlayerAlive(boolean isPlayerAlive)
	    {
	    	this.isPlayerAlive=isPlayerAlive;
	    }
	    
	    public String getEquippedWeapon()
	    {
	    	return this.equippedWeapon;
	    }
	    
	    public void setEquippedWeapon(String equippedWeapon)
	    {
	    	this.equippedWeapon=equippedWeapon;
	    }
	    
	    public int getWeaponDamage()
	    {
	    	return this.weaponDamage;
	    }
	    
	    public void setWeaponDamage(int weaponDamage)
	    {
	    	this.weaponDamage=weaponDamage;
	    }
	    
	    public int getWeaponAmmo()
	    {
	    	return this.weaponAmmo;
	    }
	    
	    public void setWeaponAmmo(int weaponAmmo)
	    {
	    	this.weaponAmmo=weaponAmmo;
	    }
	    
	    public boolean isWeaponEquipped()
	    {
	    	return this.isWeaponEquipped;
	    }
	    
	    public void setIsWeaponEquipped(boolean isWeaponEquipped)
	    {
	    	this.isWeaponEquipped=isWeaponEquipped;
	    }
	    
	    public String getCurrentMap()
	    {
	    	return this.currentMap;
	    }
	    
	    public void setCurrentMap(String currentMap)
	    {
	    	this.currentMap=currentMap;
	    }
	    
	    public int getCircleRadius()
	    {
	    	return this.circleRadius;
	    }
	    
	    public void setCircleRadius(int circleRadius)
	    {
	    	this.circleRadius=circleRadius;
	    }
	    
	    public int getRemainingPlayers()
	    {
	    	return this.remainingPlayers;
	    }
	    
	    public void setRemainingPlayers(int remainingPlayers)
	    {
	    	this.remainingPlayers=remainingPlayers;
	    }
	    
	    public boolean isMatchInProgress()
	    {
	    	return this.isMatchInProgress;
	    }
	    
	    public void setIsMatchInProgress(boolean isMatchInProgress)
	    {
	    	this.isMatchInProgress=isMatchInProgress;
	    }
	    
	    public int getMatchDuration()
	    {
	    	return this.matchDuration;
	    }
	    
	    public void setMatchDuration(int matchDuration)
	    {
	    	this.matchDuration=matchDuration;
	    }
	    
	    public boolean isFinalCircle()
	    {
	    	return this.isFinalCircle;
	    }
	    
	    public void setIsFinalCircle(boolean isFinalCircle)
	    {
	    	this.isFinalCircle=isFinalCircle;
	    }
	    
}
