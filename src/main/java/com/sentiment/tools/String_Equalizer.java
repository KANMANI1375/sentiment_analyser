package com.sentiment.tools;
public class String_Equalizer {
    public static void main(String[] args) {
        String a = "hello";
        String b = "helle";
        int count = 0;
        if(a.length() == b.length()) {
            for(int i = 0; i < a.length(); i++) {
                if(a.charAt(i) == b.charAt(i)) {
                    count = count + 1;
                }
                else {

                }
            }
            if(count == a.length()) {
                System.out.println("same words");
            }
            else {
                System.out.println("not same word");
            }
        }
        else {
            System.out.println("words not same(length differs)");
        }

    }
}