package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메모리 올리기
		Goods camera = new Goods();
		Goods computer = new Goods();
		
		//세팅
		camera.setName("니콘");
		computer.setName("삼성컴퓨터");
		
		camera.setPrice(400000);
		computer.setPrice(5000);
		
		//출력
		camera.showInfo();
		computer.showInfo();
		
		//----------------------------
		//메모리 올리기
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
	}
	
}
