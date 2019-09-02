package demo;
import java.util.Scanner;

public class TestMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Input number 1 : ");
		num1 = input.nextInt();
		System.out.println("input number 2 : ");
		num2 = input.nextInt();
		
		System.out.println("Max("+num1+", "+num2+") is " + max(num1, num2));
		input.close();
	}
	public static int max(int a, int b) {
		return ( a >= b ) ? a : b;
	}
}
