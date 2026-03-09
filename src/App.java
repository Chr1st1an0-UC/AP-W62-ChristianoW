public class App {
    public static void main(String[] args) throws Exception {
        class Employee {

    String name;
    double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method untuk menghitung salary
    public double calculateSalary() {
        return baseSalary;
    }

    // Method role (akan dioverride)
    public String getRole() {
        return "Employee";
    }

    // Method untuk print info
    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Role : " + getRole());
        System.out.println("Final Salary : " + calculateSalary());
        System.out.println();
    }
}

// Subclass Manager
class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 2000000;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}

// Subclass Programmer
class Programmer extends Employee {

    public Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 1000000;
    }

    @Override
    public String getRole() {
        return "Programmer";
    }
}

// Subclass Intern
class Intern extends Employee {

    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 300000;
    }

    @Override
    public String getRole() {
        return "Intern";
    }
}

        // Array Employee
        Employee[] employees = new Employee[4];

        employees[0] = new Manager("Alya", 5000000);
        employees[1] = new Programmer("Budi", 4000000);
        employees[2] = new Programmer("Citra", 4500000);
        employees[3] = new Intern("Dina", 2000000);

        double totalPayroll = 0;

        // Loop untuk print info dan hitung total salary
        for (Employee e : employees) {
            e.printInfo();
            totalPayroll += e.calculateSalary();
        }

        System.out.println("Total Payroll : " + totalPayroll);
    }
}
