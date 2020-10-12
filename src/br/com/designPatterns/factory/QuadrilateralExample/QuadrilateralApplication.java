package br.com.designPatterns.factory.QuadrilateralExample;

public class QuadrilateralApplication {

	public static void main(String[] args) {
		
		Quadrilateral square = QuadrilateralFactory.getQuadrilateral("quadrado", 5.0, 5.0, 5.0, 5.0);
		Quadrilateral rectangle = QuadrilateralFactory.getQuadrilateral("retangulo", 5.0, 10.0, 5.0, 10.0);
		
		System.out.println(square);
		System.out.println(rectangle);		
	}
}
