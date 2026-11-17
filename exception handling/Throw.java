public class Throw {
    public static void main(String[] args){
        int age = 19;
        if(age < 18){
            throw new ArithmeticException("You are not old enough to vote.");
        } else {
            System.out.println("You are an adult.");
        }
    }
    
}
