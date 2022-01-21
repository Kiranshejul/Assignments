import java.util.Scanner;
@FunctionalInterface
interface interest{
	int formula(int a,int b, int c);
}
public class SimpleInterest {

	public static void main(String[] args) {
    
		int p,q,r;
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		p = sca.nextInt();
		System.out.println("Enter the rate: ");
		q = sca.nextInt();
		System.out.println("Enter the time: ");
		r = sca.nextInt();
		interest si = (a, b, c) -> (a*b*c)/100;
		int ans = si.formula(p,q,r);
		System.out.println("Simple Interest: " +ans);
	}

}
