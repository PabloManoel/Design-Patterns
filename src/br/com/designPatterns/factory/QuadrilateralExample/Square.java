package br.com.designPatterns.factory.QuadrilateralExample;

public class Square extends Quadrilateral{

	public Square(Double topSide, Double rightSide, Double bottomSide, Double leftSide) {
		super(topSide, rightSide, bottomSide, leftSide);
	}

	@Override
	public Double getArea() {
		return super.getTopSide() * super.getTopSide();
	}

	@Override
	public String toString() {
		return "Square [getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}	
}
