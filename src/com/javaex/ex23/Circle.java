package com.javaex.ex23;

public class Circle extends Shape {
	
	//필드
	
	private int radius;

	//생성자
	public Circle() {
		
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	//매소드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	//매소드 일반
	public void draw() {
		System.out.println("=============원==============");
		System.out.println("반지름:"+ radius);
		System.out.println("면색:"+ getFillColor());
		System.out.println("선색:"+ getLineColor());
		System.out.println("===============================");
	}
	
	//넓이구하는 함수
		public void area() {
			System.out.println("원의 넓이===================");
			System.out.println(3.14*radius*radius);
			System.out.println("==========================");
		}
	
	
}
