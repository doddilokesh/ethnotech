class Employee {
    String name;
    float salary;
    String role;

    Employee(String name, float salary, String role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    void details() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Role: " + role);
    }
}

class Salary extends Employee {
    Salary(String name, float salary, String role) {
        super(name, salary, role);
    }
}

class Role extends Salary {
    Role(String name, float salary, String role) {
        super(name, salary, role);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Role emp1 = new Role("Loki", 20000, "DevOps");
        Role emp2= new Role("bob", 30000,"developer");
        emp1.details();
        emp2.details();
    }
}
