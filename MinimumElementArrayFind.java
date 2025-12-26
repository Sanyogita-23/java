package javacode;
import java.util.*;
public class MinimumElementArrayFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [] arr =new int [5];
		System.out.println("Enter Number");
		for(int i=0;i<arr.length;i++) {
			arr[i]=	sc.nextInt();
		}
		int min = arr[0];
		for(int num : arr)
		{
			if( num < min)
			{
				min = num;
			}
		}
		System.out.println(min);
	}

}
