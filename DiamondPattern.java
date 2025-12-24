package javacode;
import java.util.*;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i - 1);k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=3;i>=1;i--) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i - 1);k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
