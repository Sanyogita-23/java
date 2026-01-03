package constructorExample;
import java.util.*;
public class MobileUseThisKeyword {
	String brand;
	int price;

	MobileUseThisKeyword(){
		this("Unkown");
	}
	MobileUseThisKeyword(String brand){
		this(brand, 0);
	}
	MobileUseThisKeyword(String brand , int price){
		this.brand = brand;
		this.price = price;
	}
	public static void main(String[] args) {
		MobileUseThisKeyword M = new MobileUseThisKeyword();
		System.out.print(M.brand + " " + M.price);

	}

}
