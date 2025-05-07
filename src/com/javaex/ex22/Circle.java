package com.javaex.ex22;

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
		System.out.println("===========원을 그렸습니다=========");
		System.out.println("반지름:"+ radius);
		System.out.println("면 색:" + getFillColor());
        System.out.println("선 색:" + getLineColor());
		System.out.println("==================================");
	}
	
}
