**************** userdetails.java **************
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userdetails {
	
	@RequestMapping(value = "/getdetails.html" , method= RequestMethod.GET)
	public ModelAndView getForm()
	{
		ModelAndView model = new ModelAndView("Details");
		return model;
	}
	
	
	@ModelAttribute
	public void addCommonObjects(Model model)
	{
		model.addAttribute("message", "Logged In");
	}
	
	@RequestMapping(value = "/submitdetails.html" , method = RequestMethod.POST)
	public ModelAndView acceptForm(@ModelAttribute("detail1") Detail detail1)
	{
		ModelAndView model = new ModelAndView("Page");
		return model;
	}
}

*************Details.jsp***************
<html>
<body>
	
	<form:errors path="detail1.*/"/>
	<form action="/Question3/submitvalues.html" method= "post">
			<p> Username : <input type="text" name="username"/></p>
			<p> Password : <input type="password" name="password"/></p>
			<p> Email : <input type="email" name="email"/></p>
			<input type="submit" value="Submit"/>
	</form>	
</body>
</html> 

************* Page.jsp ************
<html>
<body>
	<h1>Logged In</h1>
	<h2>${message}</h2>
	
	<table>
	<tr>
		<td>User name:</td>
		<td>${detail1.username}</td>	
	</tr>
	<tr>
		<td>Email : </td>
		<td>${detail1.email}</td>
	</tr>
	</table>
</body>
</html>

*********** spring-dispatcher-servlet.xml ****************
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


************* Detail.java *********************
package com.controller;

public class Detail {
	private String username;
	private String password;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
*************web.xml ************
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>Question3</display-name>
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
