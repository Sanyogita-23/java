package constructorExample;
import java.util.*;
import java.util.Scanner;
public class StudentLoginUsingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String correctUsername = "Student123";
		
		System.out.println("Enter your name: ");
		String inputUsername = sc.nextLine();
		
		inputUsername = inputUsername.trim();
		
	if (correctUsername.equalsIgnoreCase(inputUsername))
	  {

		System.out.println("Login successful!");
		System.out.println("welcome  " + inputUsername.toUpperCase());
		
        System.out.println("Your initial is: "+ inputUsername.charAt(0));
        
        System.out.println("Username length: " +inputUsername.length());   
	  } else
	  
	  {	
		    
		      System.out.println("Invalid username");
	        }
		sc.close();
	}
}
