package br.com.designPatterns.strategy.driveExample;

public class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("the car accelerated!");
		
	}

	@Override
	public void decelerate() {
		System.out.println("the car desaccelerated!");
	}

}
