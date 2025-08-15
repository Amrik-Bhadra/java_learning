package basics.strings;

public class StringBuffer_Demo {
    public static void main(String[] args) throws InterruptedException {
        // thread safe -> using synchronise keyword
        // mutable
        StringBuffer sb = new StringBuffer();
        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());


    }
}

class Task extends Thread{
    private StringBuffer sb;
    public Task(StringBuffer sb){
        this.sb = sb;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            sb.append("a");
        }
    }
}
