package com.test.interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This programs returns all the even numbers from 0 upto the entered number num.
 * @author amnawale
 *
 */
public class AllEvenNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number - ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("The Even numbers are: ");
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
