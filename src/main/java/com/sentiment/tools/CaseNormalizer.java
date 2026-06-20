package com.sentiment.tools;

public class CaseNormalizer {
	public static void main(String[] args) {
		String a="HELLOO###@@";
		String l="";
		for(int i=0;i<a.length();i++) {
			if((int)a.charAt(i)>97 && (int)a.charAt(i)<122) {
				l=l+a.charAt(i);
			}
			if((int)a.charAt(i)>65 && (int)a.charAt(i)<90) {
				int c=(int)a.charAt(i)+32;
				l=l+(char)c;
		//System.out.println(l);
			}
		}
	System.out.println(l);	
	}

}
