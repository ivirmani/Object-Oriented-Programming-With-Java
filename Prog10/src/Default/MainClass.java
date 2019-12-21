package Default;

import ISE.ISE_Department;

public class MainClass {

	public static void main(String[] args) {
		ISE_Department i = new ISE_Department();
		i.readData(1);
		i.printData(1);
		System.out.println("\n\nEmployee/s With Experience Of Greater Than Or Equal To 20 Years");
		i.greater_than_20();
	}

}
