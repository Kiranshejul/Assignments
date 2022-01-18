import java.util.*;

public class uniqueproduct {

	public static void main(String[] args) {
		Set<String> m1=new HashSet<String>();
		
		m1.add("Redmi");
		m1.add("Samsung");
		m1.add("Apple");
		m1.add("Oppo");
		m1.add("Vivo");
		m1.add("Redmi"); //try to add Duplicate Values
		m1.add("Samsung");  //try to add Duplicate Values
		m1.add("Htc");
		m1.add("Moto");
		m1.add("Oneplus");
		
		
		System.out.println("Unique Brands of Mobiles: " + m1);
	}

}
