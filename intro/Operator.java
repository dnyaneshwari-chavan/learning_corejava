public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);

        int num = 7;
        int result = num++;
        System.out.println(result);// 8
        System.out.println(num);// 8

        int sub = 7;
        int sum = num--;
        System.out.println(sum);//6
        System.out.println(sub);//6
    
    }
}


