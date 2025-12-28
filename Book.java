package constructorExample;
public class Book {
	String title;
	Book() 
	{
		title = "Java Basics";
	}

	public static void main(String[] args) {
		Book B = new Book();
		System.out.println(B.title);

	}

}
