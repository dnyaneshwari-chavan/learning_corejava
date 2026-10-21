public class Overridingg {
    public static void main(String[] args) {
        Employee e1;

        e1 =  new FulltimeEmployee();
        e1.calculateSalary();
        e1.showDetails();

        e1 =  new PartTimeEmployee();
        e1.calculateSalary();
        e1.showDetails();

        e1 =  new TemporaryEmployee();
        e1.calculateSalary();
        e1.showDetails();
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
};
