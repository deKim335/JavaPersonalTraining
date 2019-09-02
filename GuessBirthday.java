package demo;

import java.util.Scanner;

public class GuessBirthday {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String set1 =
				" 1 3 5 7\n" +
				" 9 11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31";
		String set2 =
				" 2 3 6 7\n" +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31";
		String set3 =
				" 4 5 6 7\n" +
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";
		String set4 =
				" 8 9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		String set5 =
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31\n";
		
		System.out.println("set1 = \n" + set1 + "\n");
		System.out.println("set2 = \n" + set2 + "\n");
		System.out.println("set3 = \n" + set3 + "\n");
		System.out.println("set4 = \n" + set4 + "\n");
		System.out.println("set5 = \n" + set5 + "\n");

		System.out.println("In which sets, could you find your b-day?");
		String s1 = input.nextLine();
		int s1_length = s1.length();
		int j = Integer.parseInt(s1);
		int k =0;
		int b_day = 0;
		for ( int i=0 ; i < s1_length ; i++) {
			k = j%10;
			j = j/10;
			b_day = methodSwitch(k, b_day);
		}
		System.out.println("b-day is " + b_day);
		input.close();
}
	public static int methodSwitch(int i, int b_day) {
		switch(i) {
			case 1 : b_day += 1;
				break;
			case 2 : b_day += 2;
				break;
			case 3 : b_day += 4;
				break;
			case 4 : b_day += 8;
				break;
			case 5 : b_day += 16;
				break;
		}
		return b_day;
	}

}
