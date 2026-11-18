import java.util.ArrayList;

public class Example{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
         names.add("Alice");
         names.add("Bob");
         names.add("Cherry");
         names.add("John");
         names.add("Noha");
         names.add("Alex");
         names.add("Hannah");
         names.add("Jerry");
         names.add("Nicks");
         names.add("Alexander");
         names.add("Babes");


         System.out.println("Size of the list: " + names.size());
         names.remove("Cherry");
         System.out.println("Size of the list after removal: " + names.size());

         System.out.println(names.get(2));
         System.out.println(names);

         System.out.println("Does the list contain 'Bob'?" + names.contains("Bob"));
         System.out.println("Index of 'Nicks':" + names.indexOf("Nicks"));
         System.out.println(names.isEmpty());

         
        // System.out.println("Original List: " + names);

        // ArrayList<String> removeNames = new ArrayList<>();
        
        // removeNames.add("Alice");
        //  removeNames.add("Bob");
        //  removeNames.add("Cherry");
        //  removeNames.add("John");
        //  removeNames.add("Noha");
        //  removeNames.add("Alex");
        //  removeNames.add("Hannah");
        //  removeNames.add("Jerry");
        //  removeNames.add("Nicks");
        //  removeNames.add("Alexander");
        //  removeNames.add("Babes");

        

        //  names.removeAll(removeNames);

        // System.out.println("List after removeAll(): " + names);

        // System.out.println("Size of list: " + names.size());

        for(String name : names){
            System.out.println(name);
        }         
    }
}