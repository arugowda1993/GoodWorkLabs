package com.goodworklabs.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TopThreeLongestHashTag {

		//Why You Will Probably Pay More for Your Christmas Tree This Year
		 //How the Avocado Became the Fruit of the Global Trade
		 //Hey Parents, Surprise, Fruit Juice Is Not Fruit
		 //Visualizing Science
		public static List<String> getHashTags(String str) {
			String[] str1 = str.split(" ");
			List<String> strings = new ArrayList<>(Arrays.asList(str1));
			 for (int i = 0; i < strings.size()-1; i++) {
				for (int j = i+1; j < strings.size(); j++) {
					if(strings.get(i).length() < strings.get(j).length()) {
						strings.add(i,strings.get(j));
						strings.remove(j+1);
					}
				}
			}
			 List<String> hashtag = new ArrayList<>();
				if(strings.size()<= 3) {
					for (String string : strings) {
					hashtag.add("#"+string.toLowerCase());
					}
				}else {
					for (int i = 0; i < 3; i++) {
					hashtag.add("#"+strings.get(i).toLowerCase());
					}
				}
				return hashtag;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			System.out.println(getHashTags(str));
			sc.close();
		}
}
