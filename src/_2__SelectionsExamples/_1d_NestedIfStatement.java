package _2__SelectionsExamples;

public class _1d_NestedIfStatement {

	public static void main(String[] args) {

		/**
		 * Nested if Statements:
		 * 
		 * NOTE:
		 * Nested "if" statements means that when you have one or more than one "if" statements inside one "if" statement.
		 * 
		 * 
		 * 
		 */

		int grade = 91;
		
		if (grade >= 90) {
			System.out.print("You got grade A");
			if (grade >= 92 && grade <97) 
				System.out.println("-");
				if (grade >= 98 && grade >=100) 
					System.out.println("+");
				}
			

	}

}
