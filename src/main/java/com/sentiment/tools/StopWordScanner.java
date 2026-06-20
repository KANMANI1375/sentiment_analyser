package com.sentiment.tools;
public class StopWordScanner {
    public static void main(String[] args) {

        String sentence = "this is a laptop";
        String stopword = "the is at";

        String[] stopwordA = stopword.split(" ");
        String[] word = sentence.split(" ");

        for(int i = 0; i < word.length; i++) {

            boolean sameword = false;

            for(int j = 0; j < stopwordA.length; j++) {

                if(word[i].equals(stopwordA[j])) {
                    sameword = true;
                    break;
                }
            }

            if(!sameword) {
                System.out.println(word[i]);
            }
        }
    }
}