package javacode;
import java.util.*;
public class PyramidOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
		        System.out.print(j);
		    }
		    for(int j = i-1; j >= 1; j--){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}

}
