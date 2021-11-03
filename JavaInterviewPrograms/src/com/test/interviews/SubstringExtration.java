package com.test.interviews;

public class SubstringExtration {

	public static void main(String[] args) {
			String str = "Attachments (8)";
			String[] str1 =str.split("\\s");
			System.out.println(str1[1].substring(1, 2));
	}

}
