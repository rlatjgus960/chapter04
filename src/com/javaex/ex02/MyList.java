package com.javaex.ex02;

public class MyList {

	
	//필드
	
	private Object[] oArray;   //아무거나 받을거니까 오브젝트 사용
	private int crtPos;
	
	//생성자
	public MyList() {
		this.oArray = new Object[3];
		crtPos = 0;
	}
	
	//메소드 겟터셋터
	
	//메소드 일반
	public void add(Object object) {
		//배열의 크기가변 로직 생략
		oArray[crtPos] = object;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
}

