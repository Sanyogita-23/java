package javacode;
import java.util.*;
public class PositiveNegativeIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :  ");
		int X = sc.nextInt();
		
		if(X>=0)
		{
			System.out.println("Nymber is Positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
	}

}
