package com.javaex.ex14;

public class GoodsApp {

	//static 조사--> 스택영역에 올려놓는다
	//스태틱 메모리에서 main()을 실행한다
	
	public static void main(String[] args) {
		
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(40000);
		System.out.println(camera.getCount());
		
		
		Goods cup = new Goods("머그컵", 2000);	
		System.out.println(cup.getCount());
		
		
		
		//camera.showInfo();
		//cup.showInfo();
		
	}

}