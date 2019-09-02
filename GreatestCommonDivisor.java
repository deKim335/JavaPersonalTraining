package demo;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int n1 =1 + (int)(Math.random()*99);
		int n2 =1 + (int)(Math.random()*99);
		int gcd = gcdCalculator(n1, n2);
		
		System.out.println("The gcd of "+ n1+", " + n2 +" is " + gcd + ".");

	}
	public static int gcdCalculator(int a, int b) {
		int gcd = 1;
		int k;
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(k=2; k <= a; k++) {
			if((a%k == 0)&&(b%k == 0)) {
				gcd = k;
			}
		}
		
		return gcd;
	}

}
