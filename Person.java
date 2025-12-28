package constructorExample;
public class Person {
	String name;
	int age;
	double salary;
	Person(String n , int a ,double s){
		this.name = n;
		this.age = a;
		this.salary = s;
	}

	public static void main(String[] args) {
		Person p = new Person ("Sanyogita" , 25, 5.6861);
		System.out.println(p.name + "\n" + p.age + " \n" + p.salary );
	}

}
