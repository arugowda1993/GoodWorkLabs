package com.goodworklabs.java.test;

import java.util.Scanner;

public class Palindrome {

	private static boolean palindromedescendant(Integer num) {
		String digits = num.toString();
		Integer n = digits.length();
		while(n != 1) {
			if(n % 2 != 0)
				return false;
			n = n/2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		System.out.println(palindromedescendant(n));
	}
}
