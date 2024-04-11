package Assigment5;

import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        DepEmployee[] emp = new DepEmployee[5];
        emp[0] = new Professor("fanuel",50000, LocalDate.of(2024,4,3),2);
        emp[1] = new Professor("selam", 45000,LocalDate.of(2023,3,6),3);
        emp[2] = new Professor("sami",55000,LocalDate.of(2019,5,7),4);
        emp[3] = new Secretary("saba",20000,LocalDate.of(2020,3,4),4);
        emp[4] = new Secretary("milen",30000,LocalDate.of(2019,6,9),7);
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like to see the sum of payment of secretary and professor ");
        String str = sc.nextLine();
        if(str.equalsIgnoreCase("Y")){
            double totalSalary = 0;
            for(DepEmployee e:emp){
                totalSalary+=e.getSalary();
            }
            System.out.println("total salary of all departments is: "+totalSalary);
        }
    }
}
