package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Shape[] sArray = new Shape[4];
		
		
		Drawable[] dArray = new Drawable[4];
		
		//포인트를 메모리에 올리고 Drawable이라고 속이기
		Drawable dp = new Point (5,5);
		
		
		/*
		dp.draw();
		((Point)dp).getX();
		*/
		
		//삼각형을 메모리에 올리고 drawable이라고 속이기
		Drawable dt = new Triangle("빨강","빨강",10,20);
		
		
		/*
		dt.draw();
		((Triangle)dt).getHeight();
		((Point)dt).getX();
		*/
		
		Drawable dr = new Ractangle ("초록","초록",20,200);
		Drawable dc = new Circle("파랑","파랑",5);
	
		//배열에 추가
		dArray[0] = dt; //삼각형
		dArray[1] = dr; //사각형
		dArray[2] = dc; //원
		dArray[3] = dp; //포인트
		
		//한번에 그리기
		for(int i=0; i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		//dp가 Drawable 출신이냐?
		System.out.println(dp instanceof Drawable); 
		
		//dp가 Point 출신이냐?
		System.out.println(dp instanceof Point);
		
		//dp가 Shape 출신이냐?
		System.out.println(dp instanceof Shape);
		
		
		//한번에 면적구하기
		for(int i=0; i<dArray.length;i++) {
			if(dArray[i] instanceof Shape) {
				//방의 주소가 Shape 출신이냐
				((Shape)dArray[i]).area();
			}else {
				System.out.println("면적못구함");
			}
		}
		
	}

}
