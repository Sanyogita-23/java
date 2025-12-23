package javacode;
import java.util.*;
public class GradeCalculatorIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark : ");
		int X = sc.nextInt();
		
		if(X>=90)
		{
			System.out.println("Grade A");
		}
		else if(X>=75)
		{
			System.out.println("Grade B");
		}
		else if(X>=60)
		{
			System.out.println("Grade C");
		}
		else if(X>=40)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
