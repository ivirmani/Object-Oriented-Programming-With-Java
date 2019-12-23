package StudentPackage;
import java.util.Scanner;

public class RegisterStudent implements Student {
    String name;
    String branch;
    int total_credits;
    int [] credits = new int[6];
    String [] subject = new String[6];  //assuming 6 subjects per sem
    Scanner sc = new Scanner(System.in);

    @Override
    public void getName() {
        System.out.println("Enter name :");
        name = sc.next();

    }

    @Override
    public void getBranch() {
        System.out.println("Enter branch :");
        branch = sc.next();

    }

    public void getSubjects() throws CreditLimit {
        System.out.println("Enter subjects and credit of each subect you want to register");
        total_credits = 0;
        for(int i = 0; i < 6; i++) {
            System.out.println("Subject\t:");
            subject[i] = sc.next();
            System.out.println("Credits\t:");
            credits[i] = sc.nextInt();
            total_credits += credits[i];
        }
        if (total_credits > 30)
                throw new CreditLimit();
    }
}
