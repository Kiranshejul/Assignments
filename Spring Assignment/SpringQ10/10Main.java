import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10Main {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Spring10.xml");
		
		ContextAware CA= (ContextAware) con.getBean("ca");
		CA.draw();
		
	}

}
