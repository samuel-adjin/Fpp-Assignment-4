package problemtwo;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private int overTimeHours;
    public Secretary(String employeeName, double salary, LocalDate hireDate, int overTimeHours) {
        super(employeeName, salary, hireDate);
        this.overTimeHours = overTimeHours;
    }

    @Override
    public double computeSalary(){
        return super.computeSalary() + 12 * overTimeHours;
    }
}
