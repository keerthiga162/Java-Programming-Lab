class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
    }

    void displaySalary() {
        double grossSalary = basicSalary + hra + da;

        displayEmployee();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        PermanentEmployee emp =
            new PermanentEmployee(101, "Rahul", 30000);

        emp.displaySalary();
    }
}
