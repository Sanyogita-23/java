package javacode;
import java.util.*;
public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a word");
	    String A = sc.nextLine();
	    
	  String result = A.replaceAll("\\s+","");
	  System.out.println(result);
	}
}
