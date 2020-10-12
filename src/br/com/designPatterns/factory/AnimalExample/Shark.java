package br.com.designPatterns.factory.AnimalExample;

public class Shark extends Animal{

	public Shark(String name, String color) {
		super(name, color);
	}

	@Override
	public String getMovementType() {
		return "Swim";
	}

	@Override
	public Integer getAverageAge() {
		return 30;
	}
}