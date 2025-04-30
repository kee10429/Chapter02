package com.javaex.ex09;

public class Point2 {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point2() {
		
	}
	
	//매소드-gs
	public void setX (int x){
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	//매소드-일반
	
	public void draw() {
		System.out.println("("+x+","+y+")");
	}
	
}
