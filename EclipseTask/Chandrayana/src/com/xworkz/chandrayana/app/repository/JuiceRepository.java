package com.xworkz.chandrayana.app.repository;

public interface JuiceRepository {
 int TOTAL_NO=10;
 void store(String juices);
 
 default boolean isExist(String juice) {
	 return false;
 }
}
