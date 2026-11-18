import java.util.ArrayList;

public class Intergerexample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("ArrayList: " + numbers);

        System.out.println("Size: " + numbers.size());

        System.out.println("Element at index 2: " + numbers.get(2));

        numbers.remove(Integer.valueOf(30));

        System.out.println("After removal: " + numbers);

        System.out.println("Contains 20: " + numbers.contains(20));
    }
}