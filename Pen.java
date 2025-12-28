package constructorExample;

public class Pen {
	int price;
    String  name;
    
    Pen()
    {
    	price = 20;
    	name = "Cello";
    }
	public static void main(String[] args) {
		
		Pen p = new Pen();
		System.out.println(p.price + "\n" + p.name);
	}

}
