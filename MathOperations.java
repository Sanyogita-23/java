package constructorExample;
public class MathOperations {
	
	int add(int a, int b)
	{
		return a + b;
	}
	
	int diff(int a ,int b ) {
		return a - b ;
	}
	
	double factorial(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		 MathOperations m = new  MathOperations();
		 
		 System.out.println(m.add(5,5));
		 System.out.println(m.diff(50,30));
		 System.out.println(m.factorial(2.5,2.5));

	}

}
