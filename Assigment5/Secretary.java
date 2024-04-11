package Assigment5;

import java.time.LocalDate;

public class Secretary extends DepEmployee {
    private double overTimeHour;

    public Secretary(String name, int salary, LocalDate hireDate, double overTimeHour) {
        super(name, salary, hireDate);
        this.overTimeHour = overTimeHour;
    }

    public double getOverTimeHour() {
        return overTimeHour;
    }

    public void setOverTimeHour(double overTimeHour) {
        this.overTimeHour = overTimeHour;
    }
}
