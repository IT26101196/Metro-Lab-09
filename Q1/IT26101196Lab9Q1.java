import java.util.Scanner;

public class IT26101196Lab9Q1 {

    public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		//Input Values for a,b,c
		System.out.print("Enter value a:");
		double a = input.nextDouble();
		System.out.print("Enter value b:");
		double b = input.nextDouble();
		System.out.print("Enter value c:");
		double c = input.nextDouble();
		
		//Find square root part 
		double D = (Math.pow(b,2) - (4*a*c));
		double sqrtD = Math.sqrt(D);
		
		//Discriminent is positive 
		if (sqrtD > 0){
			double root1 = ((-b) + sqrtD) / (2*a) ;
			double root2 = ((-b) - sqrtD) / (2*a) ;
			System.out.println("Root 1:" +root1);
			System.out.println("Root 2:" +root2);
		}
		else if (sqrtD == 0){
			double root = (-b) / (2*a) ;
			System.out.println("Root:" + root);
		}
		else{
			System.out.println("No real Roots");
		}
	}
}
			
		
		