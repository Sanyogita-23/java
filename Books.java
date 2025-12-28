package constructorExample;
public class Books {
	String Title;
    int Price;
    
    Books(String T , int P)
    {
       Title = T;
       Price = P;
    }
	public static void main(String[] args) {
		
		Books B = new Books("Java Basics",300);
		System.out.println(B.Title);
		System.out.println(B.Price);
	}

}
