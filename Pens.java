package constructorExample;
public class Pens {
	String name;
	int price;

	Pens(String n ,int p)
	{
		name = n;
		price = p;
	}
	public static void main(String[] args) {
		Pens A = new Pens("Cello",20);
		System.out.println(A.name + "\n"+ A.price);
	}

}
