package demo;

public class TestRandomCharacter {

	public static void main(String[] args) {
		final int NUMBER_OF_CHARS = 100;
		final int CHARS_PER_LINE = 25;
		
		for( int i = 0 ; i < NUMBER_OF_CHARS ; i++ ) {
			char ch = RandomCharacter.getRandomCharacter();
			if( (i+1) % CHARS_PER_LINE ==0 ) {
				System.out.printf("%5c\n", ch);
			}
			else 
				System.out.printf("%5c", ch);		
		}

	}

}
