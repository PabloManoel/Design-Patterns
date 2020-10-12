package br.com.designPatterns.factory.QuadrilateralExample;

public abstract class Quadrilateral {
	
	private Double topSide;
	private Double rightSide;
	private Double bottomSide;
	private Double leftSide;

	public Quadrilateral(Double topSide, Double rightSide, Double bottomSide, Double leftSide) {
		super();
		this.topSide = topSide;
		this.rightSide = rightSide;
		this.bottomSide = bottomSide;
		this.leftSide = leftSide;
	}

	public abstract Double getArea();

	public Double getPerimeter() {;
		return this.topSide + this.rightSide + this.bottomSide + this.leftSide;
	}

	public Double getTopSide() {
		return topSide;
	}

	public Double getRightSide() {
		return rightSide;
	}

	public Double getBottomSide() {
		return bottomSide;
	}

	public Double getLeftSide() {
		return leftSide;
	}
	
	

}
