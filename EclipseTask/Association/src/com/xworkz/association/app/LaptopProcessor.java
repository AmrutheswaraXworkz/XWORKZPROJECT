package com.xworkz.association.app;

public class LaptopProcessor {
	private Processor processor;
	private String brand;
	private int storage;
	private double cost;
	private double weight;

	public LaptopProcessor(String brand, int storage, double cost, double weight) {
		super();
		this.brand = brand;
		this.storage = storage;
		this.cost = cost;
		this.weight = weight;
		System.out.println("Brand : " + brand);
		System.out.println("storage : " + storage);
		System.out.println("cost : " + cost);
		System.out.println("weight : " + weight);

	}

	public void setProcess(Processor processor) {
		this.processor = processor;
		processor.chaceSize();
		processor.clock();
		processor.processorSize();
		processor.socket();
	}
}
