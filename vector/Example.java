import java.util.Vector;

public class Example {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("Dnyaneshwari");
        names.add("Priya");
        names.add("Sneha");
        names.add("Pooja");

        System.out.println("Vector: " + names);

        System.out.println("First Element: " + names.get(0));

        System.out.println("Size: " + names.size());
    }
}