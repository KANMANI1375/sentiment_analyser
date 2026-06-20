package com.sentiment.tools;

public class Frequency_Tracker {
	public static void main(String[] args) {

		// String to array: "lorem ipsum dolor" --> {"lorem","ipsum","dolor"}
		String words = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		String[] word = words.split(" ");

		// Remove punctuations: "amet,"--> "amet"
		String p = ". ? ! , ; : — - \' \" ( ) [ ] { }";
		String no_punctuation_sentence="";
		for (int i = 0; i < word.length; i++) {
			String no_punctuations = ""+" ";
			for (int j = 0; j < word[i].length(); j++) {
				if (!p.contains(word[i].substring(j, j + 1))) {
					no_punctuations = no_punctuations + word[i].charAt(j);
				}
			}
			no_punctuation_sentence=no_punctuation_sentence+no_punctuations;
		}
		System.out.println(no_punctuation_sentence);
	
		//removing repeated words
		String[] no_punctuation_sentenceA= no_punctuation_sentence.split(" ");
		for(int i=0;i<no_punctuation_sentenceA.length;i++) {
			String[] no_repeat=new String[100];
			for(int j=0;j<no_repeat.length;j++) {
				if(!no_punctuation_sentenceA[i].equals(no_repeat[j])) {
					//no_repeat[j]=no_punctuation_sentenceA[i];
				}
				no_repeat[j]=no_punctuation_sentenceA[i];

				
			}
		System.out.println(no_repeat[]);

			
		}

		// removing repeated elements from the string
		String remove_dupe = "";
		/*
		 * for(int i=0; i<words.length();i++) { if(word[i])
		 */

		// }

		// System.out.println(word[4]);

	}
}
