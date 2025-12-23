package javacode;
import java.util.*;
public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int X = sc.nextInt();
		int  factorial=1;
		
		for(int i=1; i<=X; i++)
		{
			
			factorial *= i;
			
		}
		System.out.println(factorial);
	}

}
