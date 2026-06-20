package com.sentiment.tools;

public class Index_mapper {
	public static void main(String[] args) {
		String word="hello";
		char letter='l';
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==letter) {
				System.out.println(i);
				break;
			}
		}
	}

}
