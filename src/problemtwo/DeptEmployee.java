package problemtwo;

import java.time.LocalDate;

public class DeptEmployee {
    private String employeeName;
    private double Salary;
    private LocalDate hireDate;

    public DeptEmployee(String employeeName, double salary, LocalDate hireDate) {
        this.employeeName = employeeName;
        Salary = salary;
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return Salary;
    }
}
