import java.util.Scanner;

public class IT26101196Lab9Q2 {

    public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
	
		//Prompt user to enter radius
		System.out.print("Enter the radius of circle:");
		double radius = input.nextDouble();
		
		//Print result 
		double area = circleArea(radius);	
		System.out.println("Area of circle with radius +radius+ is " +area);
	}
	
	
	public static double circleArea(double radius) {
		return (Math.PI) *(Math.pow(radius,2));
	}
}
