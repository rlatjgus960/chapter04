package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		//boolean action = true;
		while (iSet.size()<6/*action*/) {

			int lotto = (int) (Math.random() * 45) + 1; //Math new없이 썼으니까 Static
			iSet.add(lotto);
			System.out.println(lotto); //중복체크

			/*
			if (iSet.size() == 6) {
				action = false;
			}
			*/

		}

		System.out.println("---------------");
		for (int lottoNo : iSet) {
			System.out.print(lottoNo + " ");
		}
		

	}

}
