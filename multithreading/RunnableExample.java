
class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable");
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t1 = new Thread(task, "FCT Thread");

        t1.start();

        System.out.println(t1.getName());
    }
}
