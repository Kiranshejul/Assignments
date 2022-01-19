interface Arithmetic{
	int op(int a,int b);
}
public class Arithm {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:1:Add,2:Sub,3:Mul,4:Div");
		int no=sc.nextInt();
		System.out.println("Enter Two Numbers");
		int p=sc.nextInt();
		int q=sc.nextInt();
		switch(no)
		{
		case 1:
			Arithmetic add= (int x,int y)-> p+q;
			int addition= add.op(p, q);
			System.out.println(addition);
		case 2:
			Arithmetic sub=(int x,int y)->p-q;
			int substraction=sub.op(p, q);
			System.out.println(substraction);
			
		case 3:
			Arithmetic mul= (int x,int y)->p*q;
			int multiplication=mul.op(p, q);
			System.out.println(multiplication);
			
		case 4:
			Arithmetic div= (int x,int y)->p/q;
			int division=div.op(p, q);
			System.out.println(division);
		}	
	}
}
