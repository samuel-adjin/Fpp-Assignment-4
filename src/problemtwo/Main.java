package problemtwo;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create 3 professor
        Professor p1 = new Professor("Nicolas",8000.00,LocalDate.parse("1990-03-01"),12);
        Professor p2 = new Professor("Tommy",4000.00,LocalDate.parse("2000-12-01"),8);
        Professor p3 = new Professor("Roberto",5000.00,LocalDate.parse("1995-05-21"),10);

        //Create 2 secretary
        Secretary s1 = new Secretary("Snow White",5000.00,LocalDate.parse("2000-01-01"),20);
        Secretary s2 = new Secretary("Selena",3000.00,LocalDate.parse("2010-01-01"),30);

        DeptEmployee[] department = new DeptEmployee[]{p1,p2,p3,s1,s2};

        System.out.println("Do you wish to see the total salary (Y/N) ?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toUpperCase();
        if (choice.equals("Y")) {
           double totalSalary = 0.00;
           double averageSalary =0.00;
           int counter = 0;
           for (DeptEmployee e : department) {
               counter++;
               totalSalary += e.computeSalary();
           }
           averageSalary = totalSalary/counter;
            System.out.printf("The total salary for the department is  = %.2f \n", totalSalary);
            System.out.printf("The average salary for the department is = %.2f", averageSalary);
        } else System.out.println("Thank you !");
        scanner.close();
    }
}
