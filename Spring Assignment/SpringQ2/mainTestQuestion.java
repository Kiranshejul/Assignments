package hii;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	private static ApplicationContext con;
	public static void main(String[] args) {

		con=new ClassPathXmlApplicationContext("2questionxml.xml");
		
		Question Q=(Question) con.getBean("que");
		Q.showAnswer();
		
		
	}

}
