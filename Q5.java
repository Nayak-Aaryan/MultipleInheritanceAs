package Q5pack;

public interface AccountOperations {
    public void deposit(double amount);
}
--------------------------------------------
package Q5pack;

public interface LoanService {
    public void calculateLoanEligibility(double salary);
}
----------------------------------------------------------
package Q5pack;

public class SmartBank implements AccountOperations, LoanService {
    protected double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void calculateLoanEligibility(double salary) {
        if (salary >= 30000) {
            System.out.println("Loan Eligible");
        } else {
            System.out.println("Loan Not Eligible");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
-----------------------------------------------------------------------
import java.util.Scanner;
import Q5pack.SmartBank;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmartBank s = new SmartBank();

        System.out.print("Enter Deposit Amount: ");
        double amt = sc.nextDouble();
        s.deposit(amt);

        s.showBalance();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        s.calculateLoanEligibility(salary);

        sc.close();
    }
}
