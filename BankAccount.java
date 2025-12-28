package constructorExample;
public class BankAccount {
      String name;
      int balance;
      
      BankAccount(String n,int b)
      {
    	  name = n;
    	  balance =b;
      }
	public static void main(String[] args) {
		BankAccount acc = new BankAccount ("Neha",50000);
		System.out.println("Name: "+acc.name + "\n"+ "Balnce: "+ acc.balance);
	}

}
