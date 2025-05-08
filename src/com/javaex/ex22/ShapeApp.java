package com.javaex.ex22;

import java.lang.reflect.Array;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t01 = new Triangle("빨강","검정",5,10);
		//t01.draw();
		//t01.toString();
		
		Rectangle r01 = new Rectangle("빨강","검정",5,10);
		//r01.draw();
		
		Circle c01 = new Circle("빨강","검정",5);
		//c01.draw();
		
		
		Shape st = new Triangle("초록","초록",100,100);
		//st.draw();
		//st.getWiidth(); // --> 자식이 가지고 있는 것은 안되어짐
		//st.getFillColor(); //부모가 가지고 있는것은 ok
		
		Shape sc = new Circle("빨강","빨강",50);
		// sc.getRadius();
		//sc.getFillColor();
		
		Shape sr = new Rectangle("노랑","노랑",33,33);
		
		
		//하나의 배열에 모든 도형을 담는다 --> 자식쪽의 기능은 사용할 수 없다
		//모든 도형을 담을 수 있는 배열 만들기
		
		Shape [] sArray = new Shape[3];
		
		//도형담기
		
		//sArray[0] = t01; //업캐스팅 자동으로 섞어쓰기된다
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		for(int i = 0; i<sArray.length;i++) {
			sArray[i].draw();
		}
		
		
		// 첫번째방(삼각형)의 가로값을 읽고 싶다 ---> 가려져서 못읽는다
		System.out.println(((Triangle)sArray[0]).getWidth());
		//사각형의 가로
		System.out.println(((Rectangle)sArray[2]).getWidth());
		//원의 반지름
		System.out.println(((Circle)sArray[1]).getRadius());
		
		//Shape s = new Shape(); //abstract 가 있으면 메모리에 올리면 안됨
		//s.draw();
		
		
		
	}

}