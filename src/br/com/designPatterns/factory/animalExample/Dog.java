package br.com.designPatterns.factory.animalExample;

public class Dog extends Animal{
	
	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public String getMovementType() {
		return "Walk";		
	}

	@Override
	public Integer getAverageAge() {
		return 13;
	}
}
