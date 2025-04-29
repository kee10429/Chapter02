package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods(); 
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		//세팅
		camera.setName("니콘");
		camera.setPrice(400000);
		
		computer.setName("LG그램");
		computer.setPrice(90000);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		//출력
		camera.showinfo();
		computer.showinfo();
		cup.showinfo();
		
		
		
	}

}
