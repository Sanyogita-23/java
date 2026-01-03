package constructorExample;
import java.util.*;
public class StudentThisKeyWord {
	int id;
	String name; 
	
	StudentThisKeyWord(){
		this(1,"Rahul");
	}
	StudentThisKeyWord(int id ,String name){
	this.id = id;
	this.name = name;
	}
	public static void main(String[] args) {
		StudentThisKeyWord S = new StudentThisKeyWord();
		System.out.println(S.id + " " + S.name);
	}

}
