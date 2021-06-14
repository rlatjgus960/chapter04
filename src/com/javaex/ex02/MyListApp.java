package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {

		System.out.println("Point 관리-------------");
		MyList pList = new MyList();

		Point p00 = new Point(1,1);
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		
		pList.add(p00);
		pList.add(p01);
		pList.add(p02);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("circle 관리-------------");
		MyList cList = new MyList();
		
		Circle c00 = new Circle(5);
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(15);
		
		cList.add(c00);
		cList.add(c01);
		cList.add(c02);
		
		for(int i = 0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		
	}

}
