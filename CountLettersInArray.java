package demo;

public class CountLettersInArray {

	public static void main(String[] args) {
		
		char[] chars = createRandomArray();
		int[] counts = countAlphabet(chars);
				
		printArray(chars);
		System.out.println();
		printArray(counts);
		
	}
	
	public static char[] createRandomArray() {
		char[] chars = new char[100];
		
		for (int i = 0 ; i < 100 ; i++ ) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
	}
	
	public static int[] countAlphabet(char[] array) {
		int[] counts = new int[26];
		for ( int i = 0 ; i < array.length ; i++ ) {
			counts[array[i]-'a']++;
		}
		return counts;
	}
	
	public static void printArray(char[] chars) {
		for ( int i = 0; i < chars.length ; i++) {
			if((i+1) % 20 ==0)
				System.out.println(chars[i]);
			else
				System.out.print(chars[i]+"  ");
			
		}
	}
	
	
	public static void printArray(int[] counts) {
		
		for ( int i = 0 ; i < counts.length ; i++) {
			if((i+1) % 10 ==0)
				System.out.println((char)(i+'a')+"-"+counts[i]);
			else
				System.out.print((char)(i+'a')+"-"+counts[i]+"  ");
			
		}
	}
}