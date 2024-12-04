package problemfour;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Hourly Employee --> \n" +
                "First name = " + getFirstName() + "\n" +
                "Last name = " + getLastName() + "\n" +
                "SSN = " + getSocialSecurityNumber() + "\n" +
                "wage = " + wage + "\n" +
                "Hours = " + hours + "\n" +
                "Total salary = " + getPayment() + "\n" +
                "========================================================";
    }

    @Override
    double getPayment() {
        return wage * hours;
    }
}
