package br.com.designPatterns.factory.AnimalExample;

public class Parrot extends Animal{

	public Parrot(String name, String color) {
		super(name, color);
	}

	@Override
	public String getMovementType() {
		return "Fly";
	}

	@Override
	public Integer getAverageAge() {
		return 80;
	}
}
