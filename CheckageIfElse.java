package javacode;
import java.util.*;
public class CheckageIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age: ");
		int X = sc.nextInt();
		
		if(X >= 18)
		{
			System.out.println("Your a eligible for vote");
		}
		else 
			   
		{
			System.out.println("Your not eligible for vote");
		}
	}

}
