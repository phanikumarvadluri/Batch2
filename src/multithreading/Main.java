package multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
       CounterTask counterTask1=new CounterTask(counter);
        CounterTask counterTask2=new CounterTask(counter);
        
        Thread t1=new Thread(counterTask1);
        Thread t2=new Thread(counterTask2);
        
        t1.start();// called sy
        t2.start();// called
//
        t1.join();
        t2.join();


        int count = counter.getCount();
        System.out.println(count);

    }
}
