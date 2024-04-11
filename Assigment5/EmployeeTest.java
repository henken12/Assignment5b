package Assigment5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0]= new SalariedEmployee("henok","gebremichael","5776893",1200.0);
        employees[1] = new CommissionEmployee("saba","mehary","34456534",2000.0,20.0);
        employees[2] = new HourlyEmployee("tsinat","selemun","34556727",400000.0,3);
        employees[3] =new BasePlusCommissionEmployee("abel","semere","34262468",57.0,3,4000);
        employees[4] = new SalariedEmployee("fanu","abraha","3467547",456789.0);
        double totalSalary=0.0;
        for(Employee e:employees){
            totalSalary+=e.getPayment();

        }
        System.out.printf("total salary paid: "+totalSalary);
    }




}
