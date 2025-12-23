package javacode;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("enter 4 number");
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
        	sum += arr[i];
        }
        
        System.out.println("sum is "+sum);
	}
	}
	
