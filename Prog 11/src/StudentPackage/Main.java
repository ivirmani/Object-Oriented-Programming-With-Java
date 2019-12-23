package StudentPackage;

public class Main{

    public static void main(String[] args)  {
        int semester = 1;
        Marks m1 = new Marks();
        while (semester != 5) {
            System.out.println("Enter The Details Of Student in Semester - " + semester);
            if (semester == 1) {
                m1.getName();
                m1.getBranch();
            }
            try{
                m1.getSubjects();
                m1.getMarks();
                m1.cgpa();
                m1.sgpa();
            }catch (CreditLimit e){
                System.out.println("CREDITS CANT BE MORE THAN 30!");
            }
            semester++;
        }
    }

}
