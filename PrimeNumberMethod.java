package demo;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are : ");
		printPrimeNumbers(50);
	}
	
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE=10;
		int count = 1;
		int number = 2;
		
		while(count < numberOfPrimes) {
			if (primeChecker(number))
				if(count % NUMBER_OF_PRIMES_PER_LINE==0) {
					System.out.printf("%5d\n", number);
					count++;
				}
				else {
					System.out.printf("%5d", number);
					count++;
				}
			number++;
		}
	}
	
	public static boolean primeChecker(int number) {
		for (int i = 2 ; i < number/2 ; i++ ) {
			if ( number % i == 0 )
				return false;
		}
		return true;
	}
	
	

}
