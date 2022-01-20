import java.util.*;
import java.util.function.UnaryOperator;

class replace implements UnaryOperator<String>
{
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class Replace6 {

	public static void main(String[] args) {

		List<String> s=new ArrayList<>();
		s.add("redmi");
		s.add("nokia");
		s.add("vivo");
		s.add("oppo");
		s.add("samsung");
		
		s.replace6(new replace());
		System.out.println(s);
		
	}

}
