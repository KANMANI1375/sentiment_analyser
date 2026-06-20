package com.sentiment.tools;

public class remove_punctuations {
	public static void main (String[] args) {
		String a= "$dollar!!!";
		String p=". ? ! , ; : — - \' \" ( ) [ ] { }";
		String q="";
		for(int i=0;i<a.length();i++) {
			if(!p.contains(a.substring(i,i+1))) {
				q=q+a.charAt(i);
			}
		}
	System.out.println(q);
	}

}
