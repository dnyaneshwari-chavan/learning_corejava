public class OverridingExample {
    public static void main(String[] args) {
        FulltimeEmployee obj = new FulltimeEmployee();
        obj.name = "Dnyanu";
        obj.baseSalary = 100000;
        obj.bonus = 000;
        obj.showDetails();
    }
}

class Employee {
    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class FulltimeEmployee extends Employee {
    double bonus;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class TemporaryEmployee extends Employee {
    int daysWorked;
    double dailyRate;

    @Override
    public double calculateSalary() {
        return daysWorked * dailyRate;
    }
}