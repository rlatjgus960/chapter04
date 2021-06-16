package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		/*
		for (Point p : pSet) {
			System.out.println(p.toString());
		}
		*/
		
		System.out.println(pSet.toString());
		
		
		//중복체크가 되는지??? --> 중복의 정의가 필요하다
		Point p04 = new Point(3,6);  //얘를 같다고 걸러줄줄 알았는데 걸러지지 않음
		pSet.add(p04);
		System.out.println(pSet.toString());
		
		//Point 비교 --> equals()
		System.out.println(p02.equals(p04)); //equals()로직, 정의한거 비교
		System.out.println(p01.equals(p04));
		System.out.println(p02==p04); //기본자료형 비교, 아니면 주소비교
		
		
		//hashcode
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
	}

}
