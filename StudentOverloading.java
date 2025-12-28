package constructorExample;
public class StudentOverloading {
	String name;
	int age; 
	
	StudentOverloading()
	{
		name = "Unknown";
		age =0 ;
	}
	
	StudentOverloading(String n)
	{
		name = n;
		age = 15;
	}
	
	StudentOverloading(String n , int a)
	{
		name = n;
		age = a;
	}

	public static void main(String[] args) {
		 
		StudentOverloading s1 = new StudentOverloading();
		StudentOverloading s2 = new StudentOverloading("Aman");
		StudentOverloading s3 = new StudentOverloading("Riya",16);
		
		System.out.println(s1.name + " " + s1.age);
		System.out.println(s2.name + " "+ s2.age);
		System.out.println(s3.name + " " + s3.age);

	}

}
