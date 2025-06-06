package com.javaex.ex23;

public class Triangle extends Shape {
	
	//필드
	private int width;
	private int height;

	//생성자
	public Triangle() {
		
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	
	//메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	public void draw() {
		System.out.println("=============삼각형==============");
		System.out.println("가로:"+ width);
		System.out.println("세로:"+ height);
		System.out.println("면색:"+ getFillColor());
		System.out.println("선색:"+ getLineColor());
		System.out.println("===============================");
	}
	
	//넓이구하는 함수
		public void area() {
			System.out.println("삼각형의 넓이===================");
			System.out.println(width*height/2);
			System.out.println("=============================");
		}
	
}
