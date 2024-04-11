package Assigment5;

import java.time.LocalDate;

public class DepEmployee {
    private String name;
    private int salary;
    private LocalDate hireDay;


    DepEmployee(String name, int salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
