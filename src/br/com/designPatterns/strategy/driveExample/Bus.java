package br.com.designPatterns.strategy.driveExample;

public class Bus implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("the bus accelerated!");
		
	}

	@Override
	public void decelerate() {
		System.out.println("the bus desaccelerated!");
	}

}
