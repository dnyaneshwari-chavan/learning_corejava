
public class Trycatch {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[2]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
