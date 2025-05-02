package com.javaex.ex16;

public class GoodsApp {
	
	
	//필드
	
	//생성자
	
	//매소드gs
	
	//매소드일반

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Good를 관리할 배열 3칸을 만든다
		 //int[] intArr = new int[3];
		 Goods[] goodsArr = new Goods[3];
		 
		 //상품을 메모리에 올린다
		 Goods cup = new Goods("머그컵",2000);
		 Goods camera = new Goods("니콘",400000);
		 Goods computer = new Goods("LG그램",100000);
		 
		 //배열에 상품의 !!!!! 주소!!!!를 대입한다.
		 goodsArr[0] = cup;
		 goodsArr[1] = camera;
		 goodsArr[2] = computer;
		 
		 
		 //모든 상품의 이름을 출력해라
		 for(int i=0;i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
			System.out.println(goodsArr[i].getPrice());
		 }
		 
		 //모든 상품의 정보를 출력하세요
		 for(int i=0;i<goodsArr.length;i++) {
			 goodsArr[i].showInfo();
		 }
		 

		 
	}

}
