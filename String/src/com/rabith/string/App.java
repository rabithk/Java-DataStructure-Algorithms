package com.rabith.string;

import java.util.List;

public class App {
	public static void main(String[] args) {
		StringOperation operation = new StringOperation();
		System.out.println("Reverse String =>" + operation.reverseString("Rabith Kuniyil"));
		System.out.println("----");

		List<String> suffixes = operation.getSuffixes("Rabith Kuniyil");
		for (String s : suffixes)
			System.out.println("String Suffixes =>" + s);
		System.out.println("----");

		List<String> prefixex = operation.getPrefixes("Rabith Kuniyil");
		for (String s : prefixex)
			System.out.println("String Prefixes =>" + s);
		System.out.println("----");

		System.out.println("String CommonPrefix =>"+ operation.longestCommonPrefix("Hello", "Hellos"));
		System.out.println("String CommonPrefix =>"+ operation.longestCommonPrefix("Hello", "abc"));
		System.out.println("----");

		System.out.println("String longestRepeatedSubString =>"+ operation.longestRepeatedSubString("HelloHello"));
		System.out.println("String longestRepeatedSubString =>"+ operation.longestRepeatedSubString("abc"));
		System.out.println("----");
	}

}
