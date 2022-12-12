package com.revature;

public class AlternatingLetters {
	
    public static void main(String[] args) {
        String s1 = "Spongebob";
        String s2 = "spongebob";
        
        System.out.println(alternate(s1));
        System.out.println(alternate(s2));
    }

    // Exercise, fill out this method
    // ex: input -> Spongebob, output -> SpOnGeBoB
    // ex: input -> spongebob, output -> sPoNgEbOb
    public static String alternate(String s) {
    	char x = s.charAt(0);
    	String newString = "" + x;
    	for(int i = 1; i < s.length(); i++) {
    		if(x == Character.toUpperCase(x)) {
    			newString += Character.toLowerCase(s.charAt(i));
    			x = Character.toLowerCase(s.charAt(i));
    		} else {
    			newString += Character.toUpperCase(s.charAt(i));
    			x = Character.toUpperCase(s.charAt(i));
    		}
    	}
        return newString;
    }

}
