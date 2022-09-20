import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	
	// Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		// display output on console
		System.out.println("your name is " + name);
		
		System.out.print("Enter age: ");
		int years = stdin.nextInt();
		System.out.println("your age is " + years);
		System.out.println(years * 365);
		
		System.out.print("Enter height: ");
		int height = stdin.nextInt();
		
		System.out.printf("%1$tY년 %1$tb %1$te일 현재 %4$s (%2$d)의 키는 %3$d cm 입니다.", new Date(), years, height, name);
		
		} // method main
	
} // class BASIC_IO
