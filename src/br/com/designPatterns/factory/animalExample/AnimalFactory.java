package br.com.designPatterns.factory.animalExample;

public class AnimalFactory {

	public static Animal getAnimal(String type, String name, String color) {
		if (AnimalType.CACHORRO.toString().equalsIgnoreCase(type)){
			return new Dog(name, color);
		} else if (AnimalType.PAPAGAIO.toString().equalsIgnoreCase(type)) {
			return new Parrot(name, color);
		} else if (AnimalType.TUBARAO.toString().equalsIgnoreCase(type)) {
			return new Shark(name, color);
		}
		return null;
	}

}
