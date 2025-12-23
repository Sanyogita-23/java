package javacode;
import java.util.*;
import java.util.Scanner;
public class ArrayInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("Enter 3 number");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("you enterd");
		
		for(int i=0; i<arr.length;i++)
				{
					System.out.println(arr[i]+" ");
				}
				sc.close();
	}

}
