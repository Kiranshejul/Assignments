********hellocontroller.java************

package com.gontuseries.hellocontroller; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public class HelloController extends AbstractController {   
	@Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelandview = new ModelAndView("HelloPage");
       
        modelandview.addObject("welcomeMessage","HELLO WORLD");
        return modelandview;
    }
	}

************servlet.xml***********
<?xml version="1.0" encoding="UTF-8"?> <beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:context = "http://www.springframework.org/schema/context"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans     
   http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">  
   <!-- http://www.springframework.org/schema/context 
   http://www.springframework.org/schema/context/spring-context-5.3.8.xsd -->
   
   <bean id="HandlerMapping" class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping" />
   
   <bean name="/hello.html" class="com.gontuseries.hellocontroller.HelloController" />     
   <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name = "prefix">
            <value>/WEB-INF/</value>
        </property>
          <property name = "suffix">
              <value>.jsp</value>
          </property>
    </bean> 
</beans>

************web.xml****************
<?xml version="1.0" encoding="UTF-8"?>

<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>FirstSpringMVCProject</display-name>
  
  <servlet>
   <servlet-name>spring-dispatcher</servlet-name>
  		<servlet-class>
  			org.springframework.web.servlet.DispatcherServlet
  		</servlet-class>
  </servlet>
  
  <servlet-mapping>
   <servlet-name>spring-dispatcher</servlet-name>
   		<url-pattern>/</url-pattern>
  </servlet-mapping>    
</web-app>

************hellopage.jsp***********
<html>
    <body>
        <h1>First Spring MVC Application Demo</h1>
        <h2>${welcomeMessage}</h2>
        <a href="https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-178143">Hyperlink</a>   
    </body>
</html>
