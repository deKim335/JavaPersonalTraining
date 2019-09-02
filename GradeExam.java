package demo;

public class GradeExam {

	public static void main(String[] args) {
		char[][] studentAnswers = { 
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E'},
		};
		char[] answer = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E'};
		
		for ( int i = 0 ; i < studentAnswers.length ; i++ ) {
			int points = 0;
			for( int j = 0 ; j < studentAnswers[i].length ; j++) {
				if(studentAnswers[i][j]==answer[j])
					points++;					
			}
			System.out.printf("Student %d's grade is %d/%d\n", i+1, points, answer.length);
		}
		
	}	
}
