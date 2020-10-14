package br.com.designPatterns.strategy.driveExample;

public class Pilot {
	
	private Vehicle vehicle;
	private String name;

	public Pilot(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}
	
	public void startDriving() {
		System.out.println(name + " will start driving");
		this.vehicle.accelerate();
	}
	
	public void endDriving() {
		System.out.println(name + " will end driving");
		this.vehicle.decelerate();
	}
	
	public void changeVehicle(Vehicle vehicle) {
		System.out.println("changing vehicle...");
		this.vehicle = vehicle;
	}
}
