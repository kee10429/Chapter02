package com.javaex.ex09;

public class Point {
	// 필드
	private int x;
	private int y;
	
	// 생성자
	//--> 생성자 2개
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 매소드-gs
	// 매소드-일반
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
}
