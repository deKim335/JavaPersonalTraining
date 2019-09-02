package demo;

public class PrimeNumberProducer {

	public static void main(String[] args) {
		int primeNumberCount = 0;
		final int COUNT_LIMIT=100;
		
		for( int num=2 ; primeNumberCount <= COUNT_LIMIT ; num++) {
			boolean isPrime = primeChecker(num);
			primeNumberCount=printPrime(isPrime, num, primeNumberCount);
		}
	}
	public static boolean primeChecker( int num ) {
		for ( int i = 2 ; i < num/2 ; i++ ) {
			if( num % i == 0)
				return false;
		}
		return true;
	}
	
	public static int printPrime(boolean isPrime, int num ,int primeNumberCount) {
		if(isPrime) {
			System.out.print(num + "  ");
			primeNumberCount++;
			if(primeNumberCount % 10 == 0)
				System.out.println();
			return primeNumberCount;
		}
		else
			return primeNumberCount;
	}

	
}
