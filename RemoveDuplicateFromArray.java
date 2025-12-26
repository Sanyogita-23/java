package javacode;
import java.util.*;
public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [] arr = new int[6];
		System.out.println("Enter number");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("You entered");
		HashSet<Integer>A=new HashSet<>();
		for(int num:arr) {
			A.add(num);
		}
	    System.out.println(A);
	}

}
