package basics.oops.interfaces;

public class SmartPhone implements Camera, Mobile, MusicPlayer{

    @Override
    public void clickPhoto() {
        System.out.println("Khichik");
    }

    @Override
    public void recordVideo() {
        System.out.println("tudung");
    }

    @Override
    public void makeCall() {
        System.out.println("trrringg trrringg");
    }

    @Override
    public void endCall() {
        System.out.println("cut gaya");
    }

    @Override
    public void playMusic() {
        System.out.println("Tu meri meri zohra jabi");
    }

    @Override
    public void stopMusic() {
        System.out.println("Tu meri meri zohra jabi band");
    }
}
