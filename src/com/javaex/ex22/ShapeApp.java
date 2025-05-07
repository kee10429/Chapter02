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
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		//전체 draw()로 출력 --> 자식쪽의 기능으로 사용할 수 없다)
		st.draw();
		
		
		
	}

}