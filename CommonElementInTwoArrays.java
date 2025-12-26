package javacode;
import java.util.*;
public class CommonElementInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {2,4,6,8};
		int [] arr2 = {3,6,9,12};
		HashSet<Integer>set1 = new HashSet<>();
		for(int num : arr1)
		{
			set1.add(num);
		}
		for(int num : arr2) {
			if (set1.contains(num)) {
				System.out.print(num + "");
			}
		}
	}

}
