package javacode;
import java.util.*;
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A= A^B;
		B=B^A;
		A=B^A;
		System.out.println(" A: "+A + "B: "+B);
	}

}
