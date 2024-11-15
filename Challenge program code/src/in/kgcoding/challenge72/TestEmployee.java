package in.kgcoding.challenge72;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Simran",20,34000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Sony");
        System.out.println(emp.getEmployeeDetails());
    }
}
