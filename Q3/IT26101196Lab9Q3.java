import java.util.Scanner;

public class IT26101196Lab9Q3 {
	
	//Adding 2 numbers
	public static double add(double a, double b) {
		return a + b;
	}
	
	//Multiplying 2 numbers
	public static double multiply(double c, double d) {
		return c * d;
	}
	
	//Squre numbers
	public static double square(double e) {
		return Math.pow(e, 2);
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		//1st calculation 
		double result1 = square(add(multiply(3,4) , multiply(5,7)));
		System.out.println("Result of (3 * 4 + 5 * 7)^2 :" + result1);
		
		//2nd calculation 
		double result2 = add(square(add(4,7)) , square(add(8,3)));
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 :" + result2);
	}
}
		