package constructorExample;
public class Students {
	int age;
	Students(int a){
		age = a;
	}

	public static void main(String[] args) {
		Students s = new Students(25);
		System.out.println(s.age);

	}

}
