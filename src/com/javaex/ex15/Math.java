package com.javaex.ex15;

public class Math {
	
	//static 조사
	//main()
	
	//필드
	private static double PI = 3.141592;
	
	
	//생성자
	

	//매소드-gs
	//매소드-일반
	
	
	//매소드 오버로딩
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a + b;
	}
	
	public static double plus(double a, int b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	//
	public static double circleArea(int radius) {
		double result = PI * radius * radius;
		return result;
	}
	
}
