package com.javaex.ex24;

public abstract class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;

	//생성자
	
	public Shape(){
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드 gs
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
	
	
	//인터페이스가 draw 개념을 가지고 있음
	//public abstract void draw();
	
	
	public abstract void area();
	
}
