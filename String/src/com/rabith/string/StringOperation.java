package com.rabith.string;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Text;

public class StringOperation {
	/**
	 * Reverse String
	 * 
	 * @param text
	 * @return
	 */
	public String reverseString(String text) {
		// String --> o(N*N) StringBuilder --> o(N)
		int lenghtOfString = text.length(); // o(1)
		StringBuilder revversedString = new StringBuilder();

		for (int index = lenghtOfString - 1; index >= 0; index--) {// o(N)
			revversedString.append(text.charAt(index)); // o(1)
		}
		return revversedString.toString();
	}

	/**
	 * getSuffixes
	 * 
	 * @param text
	 * @return
	 */
	public List<String> getSuffixes(String text) {

		int lengthOfText = text.length();// O(1);
		List<String> suffixesList = new ArrayList<>();

		for (int index = 0; index < lengthOfText; ++index) {
			suffixesList.add(text.substring(index, lengthOfText)); // O(1)
		}
		return suffixesList;
	}
	
	/**
	 * getPrefixes
	 * O(N)
	 * 
	 * @param text
	 * @return
	 */
	public List<String> getPrefixes(String text){
		int lengthOfText = text.length();
		List<String> prefixeList = new ArrayList<>();
		
		for( int index = 1 ; index < lengthOfText+1 ;++ index) {
			prefixeList.add(text.substring(0, index)); //O(1)
		}
		return prefixeList;
	}
}
