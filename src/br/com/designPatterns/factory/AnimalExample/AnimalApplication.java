package br.com.designPatterns.factory.AnimalExample;

public class AnimalApplication {
	
	public static void main(String[] args) {
		
		Animal papagaio = AnimalFactory.getAnimal("Papagaio", "Steve", "green");
		Animal cachorro = AnimalFactory.getAnimal("Cachorro", "Toby", "black");
		Animal tubarao = AnimalFactory.getAnimal("Tubarao", "Marta", "gray");
		
		System.out.println("Papagaio: " + papagaio.toString());
		System.out.println("Cachorro: " + cachorro.toString());
		System.out.println("Tubarao: " + tubarao.toString());
		
	}

}
