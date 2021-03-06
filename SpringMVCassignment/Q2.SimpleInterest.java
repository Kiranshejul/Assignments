*************  SimpleInterest  ****************
package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterest {
	@RequestMapping(value="/getvalues.html", method = RequestMethod.GET)
	public ModelAndView getForm()
	{
		ModelAndView model=new ModelAndView("Values");
		return model;
	}
	@RequestMapping(value="/submitvalues.html", method = RequestMethod.POST)
	public ModelAndView acceptForm(@RequestParam("amount") Double amount, @RequestParam("rate") Double rate, @RequestParam("time") int time)
	{
		ModelAndView model= new ModelAndView("Calculate");
		model.addObject("message", "Simple Interest :" + "(" + amount + "*" + rate + "*" + time + ")/100 = " + (amount*rate*time)/100);
		return model;
	}
}

****************  Calculate.jsp  ******************
<html>
<body>
	<h1>Simple Interest</h1>
	<h3>${message}</h3>
</body>
</html>

********************  Values.jsp  ************
<html>
<body>
	<h1>Student Application Form</h1>
	
	<form action="/Question2/submitvalues.html" method = "post">
	
		<p> Amount : <input type="number" name="amount"/></p>
		<p> Rate : <input type="number" name="rate"/></p>
		<p> Years : <input type="number" name="time"/></p>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>

****************** web.xml ***************
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>Question2</display-name>
  <servlet>
    <servlet-name>Spring-dispatcher</servlet-name>
    <servlet-class>
  			org.springframework.web.servlet.DispatcherServlet
  		</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>Spring-dispatcher</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
</web-app>

**************** Spring-dispatcher-servlet.xml ************
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:context="http://www.springframework.org/schema/context"
xmlns:mvc="http://www.springframework.org/schema/mvc" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
    http://www.springframework.org/schema/beans     
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
    http://www.springframework.org/schema/context 
    http://www.springframework.org/schema/context/spring-context-3.0.xsd
    http://www.springframework.org/schema/mvc
    http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd">

	<mvc:annotation-driven />
	<context:component-scan base-package="com.controller"/>

	<bean id="viewResolver"
			class="org.springframework.web.servlet.view.InternalResourceViewResolver">
			<property name="prefix">
				<value>/WEB-INF/</value>
			</property>
			<property name="suffix">
				<value>.jsp</value>
			</property>
	</bean>	
</beans>
  
