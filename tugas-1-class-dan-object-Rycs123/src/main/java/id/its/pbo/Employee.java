package id.its.pbo;

public class Employee {
    private String firstName ;
    private String lastName ;
    private double monthlySalary ;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setMonthlySalary(int monthlySalary){
        if (monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }
    }
    public double getMonthlySalary(){
        return this.monthlySalary;
    }
    public double getYearlySalary(){
        return this.monthlySalary * 12;
    }
    public void raiseSalary(int upSalary){
        if(upSalary > 0){
            double percentageSalary = (double) upSalary/100 * this.monthlySalary; 
            this.monthlySalary += percentageSalary;
        }
    }
}
