package multithreading;
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Running State");
        try {
            Thread.sleep(2000); // thread th will pause for 2s
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread th = new MyThread();
        System.out.println(th.getState()); // NEW
        th.start();
        System.out.println(th.getState()); // RUNNABLE: either ready to run or currently running
        System.out.println("Main Thread state: " + Thread.currentThread().getState()); // RUNNABLE

        Thread.sleep(100); // make the Main Thread pause for 100 milisecons
        System.out.println(th.getState()); // timed_waiting

        th.join(); // Main method (calling method of thread th), wait till th terminates
        System.out.println(th.getState());

    }
}
