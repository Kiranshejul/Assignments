import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main8 {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring8.xml");
		
		((AbstractApplicationContext) ap).close();
		
		
	}

}
