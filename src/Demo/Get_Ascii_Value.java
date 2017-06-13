package Demo;

import java.util.Scanner;

public class Get_Ascii_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*This program TestDemo.java, accepts the number as argument and print “You
		Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.
		It should print “You Have Entered Positive Value” if the value is greater than 0 along with
		the ASCII value.
		It should print “You Have Entered Negative Value” if the value is less than 0 along with the
		ASCII value.*/
		
		//Taking input value from user
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter any number");
		int n = s.nextInt();
		
		if(n == 0){
			System.out.println("You Have Entered Zero");
			String ch;
			int i = n;
			/*getting its corresponding ascii value*/
			
			ch = new Character((char)i).toString();
			System.out.println("Ascii value of  "+ n + " is " + ch);
		}
		
		else if(n > 0){
			System.out.println("You You Have Entered Positive Value");
			String ch;
			int i = n;
			ch = new Character((char)i).toString();
			System.out.println("Ascii value of  "+ n + " is " + ch);
		}
		
		else if(n < 0){
			System.out.println("You You Have Entered Nositive Value");
			String ch;
			int i = n;
			ch = new Character((char)i).toString();
			System.out.println("Ascii value of  "+ n + " is " + ch);
		}
		
		//Taking marks from user
		System.out.println("Please Enter 3 Subjects Marks : ");
		float physics = s.nextFloat();
		float chemistry = s.nextFloat();
		float mathematics = s.nextFloat();
		
		//calculating Average
		float average = ((physics+chemistry+mathematics)/3);
		
		if(average > 70){
			
			System.out.println("Grade of the student = 'A'");
			
		}
		
		else if(average >= 61 && average <= 70){
			
			System.out.println("Grade of the student = 'B'");

		}
		
		else if(average < 61){
			
			System.out.println("Grade of the student = 'c'");

		}
		
		s.close();

	}

}
