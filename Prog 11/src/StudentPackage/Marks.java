package StudentPackage;
import java.util.Scanner;


public class Marks extends RegisterStudent {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[6], cgpa[] = new int[6];

    void getMarks() {
        System.out.println("Enter The Marks Of All Subjects");
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Marks Of " + subject[i]);
            marks[i] = sc.nextInt();
        }
    }

    void cgpa() {
        for (int j = 0; j < 6; j++) {

            if (marks[j] > 90) {
                cgpa[j] = 10;
                System.out.println(subject[j] + " - " + cgpa[j]);
            } else if (marks[j] > 80 && marks[j] < 90) {
                cgpa[j] = 9;
                System.out.println(subject[j] + " - " + cgpa[j]);
            } else if (marks[j] > 70 && marks[j] < 80) {
                cgpa[j] = 8;
                System.out.println(subject[j] + " - " + cgpa[j]);
            } else if (marks[j] > 60 && marks[j] < 70) {
                cgpa[j] = 7;
                System.out.println(subject[j] + " - " + cgpa[j]);
            } else if (marks[j] > 50 && marks[j] < 60) {
                cgpa[j] = 6;
                System.out.println(subject[j] + " - " + cgpa[j]);
            } else
                System.out.println(subject[j]+" - Fail");
        }
    }

    void sgpa() {
        float sgpatotal= 0,creditsum=0;
        for (int i = 0; i < 6; i++) {
            sgpatotal+=cgpa[i]*credits[i];
        }
        for(int i=0;i<6;i++)
            creditsum+=credits[i];
        sgpatotal=sgpatotal/creditsum;
        System.out.println("SGPA Of StudentPackage.Student Is "+sgpatotal);
    }
}
