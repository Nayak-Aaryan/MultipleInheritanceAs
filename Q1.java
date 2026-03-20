package Q1pack;

public interface EmployeeDetails {
    void displayEmployeeDetails();
}
-------------------------------------
package Q1pack;

public interface SalaryCalculations {
    double calculateHRA();
    double calculateDA();
    double calculateGrossSalary();
}
----------------------------------------
package Q1pack;

public class Employee implements EmployeeDetails, SalaryCalculations {
    protected String employeeName;
    protected int empId;
    protected double baseSalary;

    public void displayEmployeeDetails() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + empId);
        System.out.println("Base Salary: " + baseSalary);
    }

    public double calculateHRA() {
        return baseSalary * 0.20;
    }

    public double calculateDA() {
        return baseSalary * 0.10;
    }

    public double calculateGrossSalary() {
        return baseSalary + calculateHRA() + calculateDA();
    }
}
-----------------------------------------------------------------
package Q1pack;

public class Manager extends Employee {
    public double bonusAmount;

    public double calculateGrossSalary() {
        return baseSalary + calculateHRA() + calculateDA() + bonusAmount;
    }
}
------------------------------------------------------------------------
import java.util.Scanner;
import Q1pack.Manager;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter Name: ");
        m.employeeName = sc.nextLine();

        System.out.print("Enter ID: ");
        m.empId = sc.nextInt();

        System.out.print("Enter Base Salary: ");
        m.baseSalary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        m.bonusAmount = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        m.displayEmployeeDetails();

        System.out.println("HRA: " + m.calculateHRA());
        System.out.println("DA: " + m.calculateDA());
        System.out.println("Gross Salary: " + m.calculateGrossSalary());

        sc.close();
    }
}
