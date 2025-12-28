package constructorExample;
 class Student {
	 int age;
	Student()
	{
		age = 15;
	}
	
	public static void main (String[] args)
	{
		Student s = new Student();
		System.out.println(s.age);
	}
}
