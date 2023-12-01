package com.skillstorm.ShapeAssignment;

public class Triangle extends Shape {
	
	public double edge1;  
	public double edge2;  
	public double edge3;  
	private int vertices = 3;
	public String color;

	public double height;
	public double width;
	
	
	public Triangle() {}
	
	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public Triangle(double edge1, double edge2, double edge3) {
		this.edge1 = edge1; 
		this.edge2 = edge2; 
		this.edge3 = edge3; 
	}

	public double area() {
		return (height * width)/2;
	}
	
	public double perimeter() {
		return edge1 + edge2 + edge3;
	}

	public double getEdges(double edge1, double edge2, double edge3) {
		return this.getEdges(edge1, edge2, edge3);
	}

	public int getVertices() {
		return vertices;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Triangle [edge1=" + edge1 + ", edge2=" + edge2 + ", edge3=" + edge3 + ", vertices=" + vertices
				+ ", color=" + color + ", height=" + height + ", width=" + width + "]";
	}
}
