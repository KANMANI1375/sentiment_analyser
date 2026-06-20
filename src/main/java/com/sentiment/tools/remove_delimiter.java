package com.sentiment.tools;

public class remove_delimiter {
	public static void main(String[] args) {
		String sentence="hello, how are you?";
		String word="";
		String delimters=",;\"'|/?";
		String space=" ";
		for(int i=0;i<sentence.length();i++) {
			if(!delimters.contains(sentence.substring(i,i+1)) && !space.contains(sentence.substring(i,i+1))) {
				word=word+sentence.charAt(i);
			}
			else {
				System.out.println(word);
				word="";
			}

			
				
		}
	}

}
