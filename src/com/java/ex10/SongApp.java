package com.java.ex10;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song iu = new Song("좋은날","아이유","Real","이민수",2010);
		Song bb = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);
		Song bk = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		
		iu.showInfo();
		bb.showInfo();
		bk.showInfo();
		
		
		System.out.println("---------------------------------------");
		Song s03 = new Song ("거짓말","BIGBANG","Always","G-DRAGON",2007);
		
		//this(5)를 호출
		this(title, artist, album, composer, year);
		
		this.track = track;
		System.out.println(song(6));
	}

}
