package br.com.designPatterns.factory.quadrilateralExample;

public class Rectangle extends Quadrilateral{

	public Rectangle(Double topSide, Double rightSide, Double bottomSide, Double leftSide) {
		super(topSide, rightSide, bottomSide, leftSide);
	}

	@Override
	public Double getArea() {
		return super.getTopSide() * super.getRightSide();
	}

	@Override
	public String toString() {
		return "Rectangle [getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
}
