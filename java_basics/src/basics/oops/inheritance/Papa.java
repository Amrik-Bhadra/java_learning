package basics.oops.inheritance;

public class Papa extends Daddu {
    boolean hasKurta;
    public Papa(){
        this.hasKurta = false;
        System.out.println("Papa ne bulaya!");
    }

    public void papaMethod(){
        super.dadduMethod();
        System.out.println("Papa Method Called!");
    }
}
