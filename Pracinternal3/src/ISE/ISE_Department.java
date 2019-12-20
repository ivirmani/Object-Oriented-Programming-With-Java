package ISE;

import MyPack3.Department;
import MyPack3.Faculty;

import java.util.Scanner;

public class ISE_Department implements Department {
	Scanner sc = new Scanner(System.in);
	Faculty f = new Faculty();
	public static int p;

	@Override
	public void readdata(int n) {
		System.out.println("Enter The Number Of Faculty Members\n");
		 p = sc.nextInt();
		for (int i = 0; i < p; i++) {
			System.out.println("Enter Name");
			f.name[i] = sc.next();
			System.out.println("Enter age");
			f.age[i] = sc.nextInt();
			try {
				if(f.age[i]>58||f.age[i]<0)
						throw new Exception("Invalid age");
			}
			catch(Exception e) {
				System.out.println("Exception handled: "+e);
				return;
			}
			System.out.println("Enter Designation Of Employee");
			f.designation[i]=sc.next();
			System.out.println("Enter Joining Date");
			f.doj[i]=sc.next();
			System.out.println("Enter Number Of Subjects Handled");
			f.sh[i]=sc.nextInt();
			System.out.println("Enter Years Of Experience");
			f.yoe[i]=sc.nextInt();
		}

	}
	public void Gt20() {
		for(int j=0;j<p;j++) {
			if(f.yoe[j]>20) {
				System.out.println("-------------------------------------------------");
				System.out.println("Name: "+f.name[j]);
				System.out.println("Age: "+f.age[j]);
				System.out.println("Designation: "+f.designation[j]);
				System.out.println("Joining date: "+f.doj[j]);
				System.out.println("Subjects Handled: "+f.sh[j]);
				System.out.println("Years of experience: "+f.yoe[j]);
				System.out.println("-------------------------------------------------");
								
			}
		}
	}
	@Override
	public void printdata(int l) {
		for(int i=0;i<p;i++) {
			System.out.println("-------------------------------------------------");
			System.out.println("Name: "+f.name[i]);
			System.out.println("Age: "+f.age[i]);
			System.out.println("Designation: "+f.designation[i]);
			System.out.println("Joining date: "+f.doj[i]);
			System.out.println("Subjects Handled: "+f.sh[i]);
			System.out.println("Years of experience: "+f.yoe[i]);
			System.out.println("-------------------------------------------------");
		}

	}

	@Override
	public void print_number_designations() {
		// TODO Auto-generated method stub

	}

	@Override
	public void number_research_consultancy_projs() {
		// TODO Auto-generated method stub

	}

	

}
