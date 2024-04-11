package Assigment5;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage*hours;
    }
    public String toString(){
        return String.format("%HourlyEmployee%:wage:hours:"+super.toString(),getWage(),getHours());
    }
}
