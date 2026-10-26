public class Main {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setName("Pratik");
        System.out.println(obj.getName());
    }
}

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}