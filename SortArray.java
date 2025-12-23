package javacode;
import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        int X[] = {1,2,5,9,0,8};		
		Arrays.sort(X);
		System.out.println(Arrays.toString(X));
		
		for(int i=X.length;i<=X.length;i++)
		{
			if(i % 2 ==0)
			{
				System.out.println("arr length is even");
			}
			else
			{
				System.out.println("arr length is odd");
			}
		}
		
		
	}

}
