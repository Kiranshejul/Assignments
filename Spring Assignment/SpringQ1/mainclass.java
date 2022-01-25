package hii;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {
	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context =new ClassPathXmlApplicationContext("customeraddress.xml");
		customer cust= (customer) con.getBean("obj");
		cust.show();
	}

}
