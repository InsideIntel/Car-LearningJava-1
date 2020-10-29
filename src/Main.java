import java.awt.*;

public class Main {
    public static void main(String[] args) {
        sendCarDetails();
    }
    public static void sendCarDetails() {
        Lambo lambo = new Lambo(Color.BLUE, 220);
        lambo.start();
        lambo.setMode(lambo.drive());
        lambo.setSpeed(60);
        System.out.println("Mode: " + lambo.getMode() + "\nSpeed: " + lambo.getSpeed());
        lambo.setSpeed(0);
        lambo.setMode(lambo.park());
        System.out.println("Mode: " + lambo.getMode() + "\nSpeed: " + lambo.getSpeed());

        lambo.setMode(lambo.reverse());
        lambo.setSpeed(20);
        System.out.println("Mode: " + lambo.getMode() + "\nSpeed: " + lambo.getSpeed());
        System.out.println("");

        lambo.stop();


    }
}
