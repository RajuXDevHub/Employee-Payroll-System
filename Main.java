import model.FullTimeEmployee;
import model.PartTimeEmployee;
import model.PayrollSystem;

import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World ! ");

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Raju Chowdhury ", 1 , 20000.00);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alex",2,6,100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details : ");
        payrollSystem.displayEmployees();


        System.out.println("Removing Employee : ");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employee System : ");
        payrollSystem.displayEmployees();
    }
}