package id.its.pbo;

public class EmployeeProgram {
    public static void main(String[] args) {
        Employee employee1 = new Employee("User", "Test",100);
        Employee employee2 = new Employee("Admin", "Test",100);
        employee1.getYearlySalary();
        employee2.getYearlySalary();
    }
}
