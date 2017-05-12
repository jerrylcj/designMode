package com.lcj.design.prototype;

public class Circle extends Shape {

	public Circle() {
		super.type = "Circle";
	}
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}