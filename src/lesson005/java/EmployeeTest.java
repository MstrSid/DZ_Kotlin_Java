package lesson005.java;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Mike", 35, 1500, "IT");
        Employee employee2 = new Employee(2, "Ann", 34, 1500, "IT");
        System.out.println(employee1.doubleSalary());
        System.out.println(employee2.doubleSalary());
    }
}

class Employee{
    int id;
    String name;
    int age;
    double salary;
    String department;

    public Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public double doubleSalary(){
        salary *= 2;
        return salary;
    }
}
