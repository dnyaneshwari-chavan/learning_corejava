class Dog {

    //String name = "Rocky";
    String name;

    void bark() {
        System.out.println(name + "bark!!!");
    }
}

public class Classexample {

    public static void main(String[] args){

        Dog obj = new Dog();

        //obj.bark();

        Dog Rocky = new Dog();
        Rocky.name = "Rocky";
        Rocky.bark();
    }
}