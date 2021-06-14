package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// 필드
	// 배열이 있으면 좋겠다
	private Point[] pArray;
	private int crtPos;

	// 생성자
	public PointList() {
		this.pArray = new Point[3];  //배열 크기 가변임. 일단 여기서 가변 로직은 생략하고 그냥 3넣어둔거
		crtPos = 0; //현재 배열 갯수

	}

	// 메소드 겟터셋터

	// 메소드 일반
	public void add(Point p) {
		 //배열 크기 가변 로직 생략
		pArray[crtPos] = p;
		crtPos++; // crtPos = crtPos +1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) { //index 위치의 값 보여주는거.. 인가
		return pArray[index];
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}

	
}
