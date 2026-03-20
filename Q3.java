package Q3pack;

public interface BookDetails {
    public void showBookInfo();
}

----------------------------------
  package Q3pack;

public interface FineCalculator {
    public double calculateFine(int lateDays);
}
------------------------------------
  package Q3pack;

public class Library implements BookDetails, FineCalculator {
    protected String bookName;
    protected String studentName;

    public void showBookInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Student Name: " + studentName);
    }

    public double calculateFine(int lateDays) {
        double fine = lateDays * 10;

        if (lateDays > 7) {
            fine += 50;
        }

        return fine;
    }
}
-------------------------------------------------------
  import java.util.Scanner;
import Q3pack.Library;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library l = new Library();

        System.out.print("Enter Book Name: ");
        l.bookName = sc.nextLine();

        System.out.print("Enter Student Name: ");
        l.studentName = sc.nextLine();

        System.out.print("Enter Late Days: ");
        int days = sc.nextInt();

        l.showBookInfo();

        double fine = l.calculateFine(days);
        System.out.println("Fine: " + fine);

        sc.close();
    }
}
