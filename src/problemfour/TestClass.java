package problemfour;

public class TestClass {
    public static Employee getMaxSalary(Employee[] emp) {
        if (emp == null || emp.length == 0) {
            return null;
        }
        Employee maxSalaryEmployee = emp[0];
        for (Employee e : emp) {
            if (e.getPayment() > maxSalaryEmployee.getPayment()) {
                maxSalaryEmployee = e;
            }
        }
        return maxSalaryEmployee;
    }

    public static void main(String[] args) {
    CommissionEmployee ce = new CommissionEmployee("Karen", "Jones","SSN0001",6000,0.30);
    BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("Donald","Trump","SSN0002",10000,.3,500);
    HourlyEmployee he = new HourlyEmployee("Houston","Jimmy","SSN0003",23,20);
    SalariedEmployee se = new SalariedEmployee("Jonh","Jon","SSN0004",2000);
    Employee[] emp = new Employee[]{ce,base,he,se};
    for(Employee em: emp){
        System.out.println(em);
    }

    Employee maxSalaryEmployee = getMaxSalary(emp);
    for (Employee em : emp) {
        System.out.println(em);
    }
    if (maxSalaryEmployee != null) {
        System.out.printf("The employee with the maximum salary is: %s %s with a salary of %.2f%n", maxSalaryEmployee.getFirstName(), maxSalaryEmployee.getLastName(), maxSalaryEmployee.getPayment());
    }
    else { System.out.println("No employees found.");
    }
    }
}
