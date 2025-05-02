package com.javaex.ex14;

public class Goods {

	// 필드
	private String name;
	private int price;
	private static int count;
	
	
	// 생성자
	public Goods() {
		// 메모리
		count = count+1;   //count++   ++count
	}

	public Goods(String name, int price) {
		// 메모리
		this.name = name;
		this.price = price;
		count = count+1;   //count++   ++count
	}

	// 메소드-gs
	// 이름저장
	public void setName(String name) {
		this.name = name;
	}

	// 이름읽기
	public String getName() {
		return name;
	}

	// 가격 저장
	public void setPrice(int price) {
		this.price = price;
	}

	// 가격 읽기
	public int getPrice() {
		return price;
	}
	
	// 카운터 읽기
	public int getCount() {
		return count;
	}
	

	// 메소드-일반
	// 정보출력
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("==========================");
	}
}