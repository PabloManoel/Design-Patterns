package br.com.designPatterns.strategy.driveExample;

public class DriveApplication {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();
		Vehicle bus = new Bus();
		
		Pilot pilot1 = new Pilot("Gabriel", car);
		Pilot pilot2 = new Pilot("Lucas", motorcycle);
		
		pilot1.startDriving();
		pilot2.startDriving();
		
		System.out.println();
		
		pilot1.endDriving();
		pilot1.changeVehicle(bus);
		pilot1.startDriving();
		pilot1.endDriving();
		
		System.out.println();
		
		pilot2.endDriving();		
	}

}
