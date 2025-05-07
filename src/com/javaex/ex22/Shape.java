package com.javaex.ex22;

public class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape () {
		
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	//매소드 gs

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	//매소드 일반
	public void draw() {
		System.out.println("shape draw()");
	 //---> 자식쪽이 부모쪽꺼로 올라옴(같은 draw가 있기 때문에 --> 매소드 오버라이딩)
	}
	

}
