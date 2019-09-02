package demo;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Palindrome checker!");
		System.out.println("Input a word that you want to check : ");
		
		String s1 = input.nextLine();
		int s1Length = s1.length();
		boolean isPalindrome = true; 
		
		for ( int i = 0 ; i <= s1Length/2 ; i++ ) {
			if( s1.charAt( i ) != s1.charAt( s1Length-1-i )) {
				isPalindrome = false;
				break;
			}
		}
		
		if( isPalindrome) 
			System.out.println(s1 + " is palindrome.");
		else
			System.out.println(s1 + " is not palindrome.");
		
		input.close();
	}

}
