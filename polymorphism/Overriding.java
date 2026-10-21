public class Overriding {
    public static void main(String[] args){
        System.out.println(obj.add(10,10));
        System.out.println(obj.add(10,10,10,10,10));
        System.out.println(obj.add(10,10,10,10,10,10));
        System.out.println(obj.add(10,10,10,10,10,10));
        System.out.println(obj.add(10,10,10));
    }
    
}

class Calculator{
        public int add(int... numbers){
            int sum = 0;
            for(int num : numbers){
                sum += num;

            }
            return sum;
        }
    }
