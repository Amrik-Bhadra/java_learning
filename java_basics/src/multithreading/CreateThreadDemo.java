package multithreading;

class World extends Thread{
    @Override
    public void run(){
        for(int i=0; i<100000; i++){
            System.out.println(Thread.currentThread().getName() + " using extends");
        }
    }
}

class UsingRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<100000; i++){
            System.out.println(Thread.currentThread().getName() + " using runnable");
        }
    }
}

public class CreateThreadDemo {
    public static void main(String[] args) {
        UsingRunnable ur = new UsingRunnable();
        Thread t1 = new Thread(ur); // new
        t1.start(); // runnable

        World world = new World();
        world.start();

        for(int i=0; i<100000; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
