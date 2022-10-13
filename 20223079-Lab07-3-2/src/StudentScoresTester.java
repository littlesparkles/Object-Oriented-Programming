import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String names = in.nextLine();
			if (names.equals("-1"))
				done = true;
			else {
				System.out.println("Enter the student's score: ");
				int scores = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				studSc.add(names, scores);
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		System.out.println("Highest Student is " + studSc.getHighest());
		System.out.println("Lowest Student is " + studSc.getLowest());
	}
}
