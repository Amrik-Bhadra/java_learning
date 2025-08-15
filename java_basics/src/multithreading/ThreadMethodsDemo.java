package multithreading;

class MyThreadMethods extends Thread{
    MyThreadMethods(String name){
        super(name);
    }
    @Override
    public void run(){
//        for(int i=1; i<=5; i++){
//            try {
//                System.out.println(i);
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        try {
//            Thread.sleep(5000);
//            System.out.println(Thread.currentThread().getName() + " terminated");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        System.out.println(Thread.currentThread().getName() + " - priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
//        MyThreadMethods th = new MyThreadMethods();
//        th.start();
//        th.join(); // Main wait for th to finish its work then performs further tasks

//        for(int i=6; i<=10; i++){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println(Thread.currentThread().getName() + " terminated");

        MyThreadMethods l = new MyThreadMethods("Low Priority Thread");
        MyThreadMethods m = new MyThreadMethods("Medium Priority Thread");
        MyThreadMethods h = new MyThreadMethods("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}
