package demo;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Decimal number : ");
		int dec = input.nextInt();
		String hex = "";
				
		/*while(dec > 0) {
			if(dec%16 >=10) {
				switch(dec%16) {
					case 10 : hex ='A' + hex; break;
					case 11 : hex ='B' + hex; break;
					case 12 : hex ='C' + hex; break;
					case 13 : hex ='D' + hex; break;
					case 14 : hex ='E' + hex; break;
					case 15 : hex ='F' + hex; break;
				}
			}
			else 
				hex = dec%16 + hex;
		dec/=16;
		} */
		if (dec == 0)
			System.out.println(dec);
		else {
			while(dec !=0) {
				int hexValue = dec % 16;
				
				char hexDigit = ( 0 <= hexValue && hexValue <= 9 ) ? (char)(hexValue + '0') : (char)(hexValue -10 + 'A');
				hex = hexDigit + hex;
				dec /= 16;
			}
			System.out.println(hex);
		}
		input.close();
	}
}
