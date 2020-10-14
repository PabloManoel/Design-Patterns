package br.com.designPatterns.strategy.driveExample;

public class Motorcycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("the motorcycle accelerated!");
		
	}

	@Override
	public void decelerate() {
		System.out.println("the motorcycle desaccelerated!");
	}

}
