package br.com.designPatterns.factory.AnimalExample;

public abstract class Animal {
	
	private String name;
	private String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public abstract String getMovementType();
	public abstract Integer getAverageAge();
	
	public String getName() {
		return this.name;
	};

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "Animal [getMovementType()=" + getMovementType() + ", getAverageAge()=" + getAverageAge()
				+ ", getName()=" + getName() + ", getColor()=" + getColor() + "]";
	};
	
	
}
