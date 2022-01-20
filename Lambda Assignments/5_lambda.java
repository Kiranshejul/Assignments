import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class firstletter {
	public static void main(String a[])
	{
		
		List<String> b = Arrays.asList("Kiran", "Akash", "Vikas", "Sachin", "Nitin"); 
		Consumer<String>consumerString=s1->System.out.println(s1);
		b.stream()
		       .map(s1 ->s1.substring(0, 1)) 
		       .forEach(s1 ->System.out.println(s1)); 
	}

}
