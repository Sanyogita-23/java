package javacode;
import java.util.*;
public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		
		System.out.println("choose operation(+,-,*,/): ");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
			System.out.println("Resulit =  "+(a+b));
			break;
			
		case '-':
			System.out.println("Resulit =  "+(a-b));
			break;
		
		case '*':
			System.out.println("Resulit =  "+(a*b));
			break;
			
		case'/':
			System.out.println("Resulit =  "+(a/b));
			break;
			
		default:
			System.out.println("Invalid operator!");
		}
		
	}

}
