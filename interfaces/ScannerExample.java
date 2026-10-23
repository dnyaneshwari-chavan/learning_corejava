import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter your Age: ");
        int Age = scanner.nextInt();
        System.out.println("Age: " + Age);

        System.out.print("Enter your Salary: ");
        double Salary = scanner.nextDouble();
        System.out.println("Salary: " + Salary);

        System.out.print("Are you a dev: ");
        Boolean isDev = scanner.nextBoolean();
        System.out.println("isDev: " + isDev);


        scanner.close();
    }
    
}