package com.rabith.string;

public class StringOperation {
	public String reverseString(String text) {
		//String --> o(N*N)  StringBuilder --> o(N)
		int lenghtOfString = text.length(); //o(1)
		StringBuilder revversedString = new StringBuilder();
		
		for(int index = lenghtOfString-1 ; index >= 0; index--) {//o(N)
			revversedString.append(text.charAt(index)); //o(1)
		}
		return revversedString.toString();
	}
}
