1. Class Hello9

public class Hello_9 {

	public void init() throws Exception
    {
        System.out.println( " I'm "  + " the init() method");
    }

    public void destroy() throws Exception
    {
        System.out.println("I am " + " the destroy() method");
    }
}
2. import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap=new ClassPathXmlApplicationContext("SpringQ9.xml");
		((AbstractApplicationContext) ap).close();		
	}
}
XML File

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans 
http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

	<bean id="hw" class="Hello_9"
          init-method="init" destroy-method="destroy"/>

</beans>
