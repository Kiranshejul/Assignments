package hii;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {  
		
		
	
/*
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Welcome to capgemini'");
String message =  (String)exp.getValue();
System.out.println(message);
	*/
		
/*		
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Welcome     To'.concat('SpringExpression')");                
String message = (String) exp.getValue(); System.out.println(message);
*/

	/*
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello'.bytes"); 
byte[] bytes = (byte[]) exp.getValue();
for(int i=0;i<bytes.length;i++) {
System.out.print(bytes[i]+" "); 
}
*/

/*		
ExpressionParser parser = new SpelExpressionParser();
Expression exp =
     parser.parseExpression("new String('hello    world').toUpperCase()");
String message = exp.getValue(String.class); System.out.println(message);
*/
		
	 
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello Akshay'.bytes.length");  
int length = (Integer) exp.getValue();  
System.out.println(length);  

		 
}  
} 
