package Q4pack;

public interface TheoryMarks {
    public void getTheoryMarks(int marks);
}
--------------------------------------------
package Q4pack;

public interface PracticalMarks {
    public void getPracticalMarks(int marks);
}
-----------------------------------------------
package Q4pack;

public class ResultSystem implements TheoryMarks, PracticalMarks {
    protected int theory;
    protected int practical;

    public void getTheoryMarks(int marks) {
        theory = marks;
    }

    public void getPracticalMarks(int marks) {
        practical = marks;
    }

    public void showResult() {
        int total = theory + practical;
        System.out.println("Total Marks: " + total);

        if (total >= 75) {
            System.out.println("Result: Distinction");
        } else if (total >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
------------------------------------------------------------------------
import java.util.Scanner;
import Q4pack.ResultSystem;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ResultSystem r = new ResultSystem();

        System.out.print("Enter Theory Marks: ");
        int t = sc.nextInt();

        System.out.print("Enter Practical Marks: ");
        int p = sc.nextInt();

        r.getTheoryMarks(t);
        r.getPracticalMarks(p);

        r.showResult();

        sc.close();
    }
}
