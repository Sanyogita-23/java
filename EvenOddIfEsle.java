package javacode;
import java.util.*;
public class EvenOddIfEsle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int X = xyz.nextInt();
		
		
		if(X % 2 ==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
