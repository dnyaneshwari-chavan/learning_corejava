public class Overloading {
    public static void main(String[] args){
        Calculator obj = new Calculator(); 

        System.out.println(obj.add(10, 10));
        System.out.println(obj.add(10, 10, 20));
        System.out.println(obj.add(10, 10));


    }
    
}

class Calculator{
    public int add(int a, int b) {
        
        return a+b;
    }

     public int add(int a, int b, int c) {
        
        return a+b+c;
    }

    public double add(double a, double b) {
        return a+b;
    }
}
