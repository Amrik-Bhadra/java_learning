package multithreading;
class Counter{
    private int count = 0;
//    public void increment(){
//        count++;
//    }

    // making a method synchronized
//    public synchronized void increment(){
//        count++;
//    }

    public void increment(){
        // making a block synchronized
        synchronized (this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}

class MyThread2 extends Thread{
    Counter counter;
    MyThread2(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}

public class Synchronization_Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread2 t1 = new MyThread2(counter);
        MyThread2 t2 = new MyThread2(counter);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());  // not give 2000 always, as now t1 and t2 are asynchronously accessing increment()
        // for making it synchronous access of increment, make the increment() synchronized
    }
}
