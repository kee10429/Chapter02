package com.javaex.ex22;

public abstract class Shape {
	//--> 전체를 단독적으로 올리지 마세요
	
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
	
	//코드는 작성하고 싶어도 못한다 --> 안만들면 되잖아?
	//그러나 필요는 하다 --> 자식들이 만들어야 한다.
	//오버라이딩 용 메소드 작성 메소드 껍데기만 만들기
	//abstract 사용해서 내부코드는 없어도 되게 한다
	//abstract을 사용한 메소드는 자식이 꼭 구현해야한다
	public abstract void draw(); //내용을 안써도 됨 --> 오버라이딩용 메소드
	

}
