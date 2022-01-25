import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemonstrate {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Spring5.xml");
		
		Demonstrate demo=(Demonstrate) con.getBean("msg1");
		System.out.println(demo.getMsgID()+" "+demo.getMsg() );
		
	}
}
