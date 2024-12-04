package problemfour;

public class TestClass {
    public static Employee findMaxSalary(Employee[] emp) {
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
    BasePlusCommissionEmployee base1 = new BasePlusCommissionEmployee("Donald","Sam","SSN0002",1000,.3,500);
    BasePlusCommissionEmployee base2 = new BasePlusCommissionEmployee("Bill","Tim","SSN0005",18000,.3,1000);
    HourlyEmployee he = new HourlyEmployee("Houston","Jimmy","SSN0003",23,20);
    SalariedEmployee se = new SalariedEmployee("Jonh","Jon","SSN0004",2000);
    Employee[] emp = new Employee[]{ce,base1,base2,he,se};
    for(Employee em: emp){
        System.out.println(em);
    }

    Employee maxSalaryEmployee = findMaxSalary(emp);
    if (maxSalaryEmployee != null) {
        System.out.printf("The employee with the maximum salary is: %s %s with a salary of %.2f%n", maxSalaryEmployee.getFirstName(), maxSalaryEmployee.getLastName(), maxSalaryEmployee.getPayment());
    }
    else { System.out.println("No employees found.");
    }
    }
}
