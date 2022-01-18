import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	String Dev_nm();
}
@Info(Dev_nm="Kiran")
class developer{
	int Dev_Id;
	String date;
	String time;
	int version;
	public developer(int dev_Id, String date, String time, int version) {
		super();
		Dev_Id = dev_Id;
		this.date = date;
		this.time = time;
		this.version = version;
	}	
}

public class Info {

	public static void main(String[] args) {
		

		developer d=new developer(10, "18/01/2021", "1PM", 11);
		System.out.println("DveloperID "+ d.Dev_Id);
		System.out.println("Date " + d.date);
		System.out.println("Time " + d.time);
		System.out.println("Version " + d.version);
		Class c=d.getClass();
		Annotation A1=c.getAnnotation(Info.class);
		Info in=(Info)A1;
		System.out.println("DeveloperName: " + in.Dev_nm());
	}

}
