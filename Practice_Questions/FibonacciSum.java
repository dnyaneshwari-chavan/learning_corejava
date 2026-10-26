public class FibonacciSum {
    public static void main(String[] args){
        int terms = 7;
        long first = 0;
        long second = 1;
        long sum = 0;

        System.out.print("Fibonacci series:");

        for(int i = 1; i <= terms; i++){
            System.out.print(first+" ");
            sum += first;

            long next =  first + second;
            first =  second;
            second = next;
        }
        System.out.println("\nSum: "+ sum);
    }
    
}
