package basics.oops.inheritance;

public class Beta extends Papa {
    boolean hasBlazer;
    public Beta(){
        hasBlazer = true;
        System.out.println("Beta ne bulaya!");
    }

    public void betaMethod(){
        super.papaMethod();
        System.out.println("Beta Method Called!");
    }
}
