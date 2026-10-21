enum Day {
    Monday, 
    Tuesday, 
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday 
}


public class Enum {
    public static void main(String[] args){
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday is first day of a week");
                break;
            case 2:
                System.out.println("Tuesday is Second day of a week");
                break;
            case 3:
                System.out.println("Wednesday is Third day of a week");
                break;
            case 4:
                System.out.println("Thursday is Fourth day of a week");
                break;
            case 5:
                System.out.println("Friday is Fifth day of a week");
                break;
            case 6:
                System.out.println("Saturday is Sixth day of a week");
                break;
            case 7:
                System.out.println("Sunday is seventh day of a week");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
    
