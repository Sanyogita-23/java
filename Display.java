package constructorExample;
public class Display {

	void show(int a) {
		System.out.println("Integer : "+a);
	}
	void show (String a) {
		System.out.println("String: "+a);
	}
	void show (double a) {
		System.out.println("Double: "+a);
	}
	public static void main(String[] args) {
	    Display d = new Display();
	    
	    d.show(10);
	    d.show("Hello");
	    d.show(5.5);		
	}

}
