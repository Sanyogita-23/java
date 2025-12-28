package constructorExample;
public class BookOverloding {
     String name ;
     int price;
     
     BookOverloding()
     {
    	 name = "Unkonwn";
    	 price = 0;
     }
     BookOverloding(String n)
     {
    	 name = n;
    	 price = 300;
     }
     BookOverloding(String n , int p)
     {
    	 name = n;
    	 price = p;
     }
	public static void main(String[] args) {
		BookOverloding B1 = new BookOverloding();
		BookOverloding B2 = new BookOverloding("Java Basices");
		BookOverloding B3 = new BookOverloding("SQL",400);
		
		System.out.println(B1.name + " = " + B1.price);
		System.out.println(B2.name + " = " + B2.price);
		System.out.println(B3.name + " = " + B3.price);

	}

}
