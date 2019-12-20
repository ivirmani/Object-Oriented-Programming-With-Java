package Default;
import MyPack3.Department;
import ISE.ISE_Department;
import MyPack3.Faculty;
public class MainClass extends ISE_Department{

	public static void main(String[] args) {
		ISE_Department i = new ISE_Department();
		i.readdata(1);
		i.printdata(1);
		
		System.out.println("Following are the people with experience greater than 20 years");
		i.Gt20();
	}

}
