import java.util.Scanner;

public class IT26101196Lab9Q4 {
	
	//Final marks(a)
	public static double calcFinalMark(double aMark, double eMark){
		double finalMark = (aMark * 0.30) +(eMark * 0.70);
		return finalMark;
	}
	
	//Final Grade(b)
	public static char finalGrade(double finalMark) {
		char grade;
		if(finalMark >= 75) {
			grade = 'A';
		}
		else if(finalMark < 75 && finalMark >= 60) {
			grade = 'B';
		}
		else if(finalMark < 60 && finalMark >= 50) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		return grade;
	}
	
	//Print details(c)	
	public static void printDetails(String name, double finalMark, char grade ) {
		System.out.printf("%-15s %-15.2f %-10c %n" , name , finalMark , grade);
	}
	
	public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		
		//Create arrays for name final mark and grade
		String[] names = new String[5];
		double [] finalMarks = new double[5];
		char [] grades = new char[5];
		
		//user inputs 
		for(int i = 0; i < 5; i++){
			System.out.println();
			
			System.out.print("Enter name of student" + (i+1) + ":");
			names[i] = input.nextLine();
			
			System.out.print("Enter Assignment mark out of 100 for" + names[i] + ":");
			double assignment = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();
            input.nextLine();
			
			//calculate final mark 
			finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = finalGrade(finalMarks[i]);
		}
		
		System.out.println();
        System.out.printf("%-15s %-15s %-10s%n",  "name" , "finalMark" , "grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
		
		input.close();
	}
}