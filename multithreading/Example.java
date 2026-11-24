   

class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread is Running");
    }
}  



public class Example{
    public static void main(String[] args){
        MyThread obj = new MyThread();
        //obj.run();
         obj.start();

         Thread t1 = new Thread("MyThread1");
         t1.start();

         System.out.println(t1.getName());

    }
}