package br.com.designPatterns.factory.Quadrilateral;

public class QuadrilateralFactory {

	public static Quadrilateral getQuadrilateral(
			String type, 
			Double topSide, 
			Double rightSide, 
			Double bottomSide, 
			Double leftSide
			) {
		
		if ("quadrado".equalsIgnoreCase(type)) {
			return new Square(topSide, rightSide, bottomSide, leftSide);
		} else if ("retangulo".equalsIgnoreCase(type)) {
			return new Rectangle(topSide, rightSide, bottomSide, leftSide);
		}
		return null;
	}

}
