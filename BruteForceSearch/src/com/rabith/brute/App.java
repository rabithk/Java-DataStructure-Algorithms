package com.rabith.brute;

public class App {

	public static void main(String[] args) {
		String text = "My name is Joe";
		String pattern = "name";

		System.out.println(search(text, pattern));
	}

	/**
	 * search
	 * 
	 * @param text
	 * @param pattern
	 * @return
	 */
	public static int search(String text, String pattern) {

		int lenghtOfText = text.length();
		int lenghtOfPattern = pattern.length();

		for (int i = 0; i <= lenghtOfText - lenghtOfPattern; i++) {

			int j;

			for (j = 0; j < lenghtOfPattern; j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}
			if (j == lenghtOfPattern)
				return i;
		}

		return lenghtOfText;

	}

}
