package com.company;



public class Main {

    public static void main(String[] args) {
	int vowels = 0;
	String str = "Apples and pears";
	str = str.toLowerCase();

	for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
    vowels++;
        }
    }

        System.out.println("Number of vowels in the string is: " + vowels);
    }

}
