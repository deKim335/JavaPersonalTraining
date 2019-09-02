package demo;

import java.util.Scanner;

public class HexDigit2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your Hex number : ");
		String hex_input = input.nextLine();
		
		int dec = hexToDecimal(hex_input.toUpperCase());

		System.out.println(dec);
		input.close();
	}
	
	public static int hexToDecimal(String hex) {
	int j = hex.length();
	char ch;
	int hexEx=0;
	int dec=0;
		for(int i = j - 1 ; i >= 0 ; i--) {
					ch = hex.charAt(i);
					if('A' <= ch && ch <= 'F') {
						hexEx = ch - 'A' + 10;
						dec += hexEx * Math.pow(16, Math.abs(i - j + 1));
					}
					else if(Character.isDigit(ch)) {
						hexEx = ch - 48;
						dec += hexEx * Math.pow(16, Math.abs(i - j + 1));
					}
					else {
						System.out.println("Invalid input");
						System.exit(0);
					}
		}
		return dec;
	}
	public static int hexCharToDecimal(char ch) {
		int hexEx=0;
		if('A' <= ch && ch <= 'F') {
			hexEx = ch - 'A' + 10;
		}
		else if(Character.isDigit(ch)) {
			hexEx = ch - 48;
		}
		return hexEx;
	}
}
