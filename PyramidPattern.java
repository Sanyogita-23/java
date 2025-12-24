package javacode;
import java.util.*;
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
