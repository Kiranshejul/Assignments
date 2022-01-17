import java.util.Scanner;
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("Numbers: ");
		int a =sca.nextInt();
        int b=sca.nextInt();
        try {
            System.out.println(a / b); 
       	    }
        catch (Exception e) {
            System.out.println("UnsupportedOperationException");
         		}	
	}
}
