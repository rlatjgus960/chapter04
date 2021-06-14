package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		//////////////////////////////
		//////////// 포인트 관리
		///////////////////////////////
		System.out.println("Point관리======================");
		// 포인트를 관리하는 리스트(배열대용)를 만든다

		PointList pList = new PointList();

		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);
		Point p02 = new Point(4, 4);

		pList.add(p00); // 배열 한개
		pList.add(p01); // 배열 두개
		pList.add(p02); // 배열 세개

		System.out.println(pList.toString());

		System.out.println(pList.size()); // 3

		System.out.println(pList.get(1).toString()); // Point [x=3, y=3]
		System.out.println(pList.get(1));
		System.out.println(pList.get(1).getX());
		System.out.println("------------------------------");

		for (int i = 0; i < pList.size(); i++) {
			// System.out.println(pList.get(i)); toString 출력
			System.out.println(pList.get(i).getX());
		}
		System.out.println("=================================");

		
		
		
		
		
		
		//////////////////////////////
		//////////// 원 관리
		///////////////////////////////
		System.out.println("Circle관리======================");

		CircleList cList = new CircleList();

		Circle c00 = new Circle(5);
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(15);

		cList.add(c00);
		cList.add(c01);
		cList.add(c02);

		System.out.println(cList);
		
		System.out.println(cList.size()); 

		System.out.println(cList.get(1).toString()); 
		System.out.println(cList.get(1).getRadius());
		

		System.out.println("------------------------------");

		for (int i = 0; i < cList.size(); i++) {

			System.out.println(cList.get(i));
		}
		System.out.println("=================================");
		
		
		
		
		
		
		
		
		/*
		pList.remove(1); //[1]데이터 삭제 --> 배열 두개로 줄어듦
		
		*/
		
		
		/*
		배열 사용시
		Point[] pArray = new Point[2];

		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);

		pArray[0] = p00;
		pArray[1] = p01;
		
		
		for (int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i]);
		}
		*/

	}

}
