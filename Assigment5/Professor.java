package Assigment5;

import java.time.LocalDate;

public class Professor extends DepEmployee{
private int numberOfPublication;
Professor(String name, int salary, LocalDate hireDate,int numberOfPublication){
    super(name,salary,hireDate);
    this.numberOfPublication=numberOfPublication;
}

    public int getNumberOfPublication() {
        return numberOfPublication;
    }

    public void setNumberOfPublication(int numberOfPublication) {
        this.numberOfPublication = numberOfPublication;
    }
}
