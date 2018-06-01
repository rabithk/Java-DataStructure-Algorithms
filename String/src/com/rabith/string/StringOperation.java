package com.rabith.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	 * getPrefixes O(N)
	 * 
	 * @param text
	 * @return
	 */
	public List<String> getPrefixes(String text) {
		int lengthOfText = text.length();
		List<String> prefixeList = new ArrayList<>();

		for (int index = 1; index < lengthOfText + 1; ++index) {
			prefixeList.add(text.substring(0, index)); // O(1)
		}
		return prefixeList;
	}

	/**
	 * longestCommonPrefix
	 * 
	 * @param text1
	 * @param text2
	 * @return
	 */
	public String longestCommonPrefix(String text1, String text2) {

		int commonLenght = Math.min(text1.length(), text2.length());

		for (int index = 0; index < commonLenght; ++index) {
			if (text1.charAt(index) != text2.charAt(index)) {
				return text1.substring(0, index);
			}
		}

		return text1.substring(0, commonLenght);
	}

	/**
	 * longest Repeated SubString
	 * 
	 * @param text
	 * @return
	 */
	public String longestRepeatedSubString(String text) {
		int lenghtOfText = text.length();

		List<String> suffixes = getSuffixes(text);
		Collections.sort(suffixes);
		String longestSubString = "";

		for (int i = 0; i < lenghtOfText - 1; i++) {
			String tempString = longestCommonPrefix(suffixes.get(i), suffixes.get(i + 1));

			if (tempString.length() > longestSubString.length()) {
				longestSubString = tempString;
			}
		}

		return longestSubString;

	}
}
