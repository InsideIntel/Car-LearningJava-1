import java.awt.*;

public class Lambo extends Car {
    private Color color;
    private int maxSpeed;
    private String mode;
    private int speed;
    private boolean off;


    public Lambo(Color color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        off = on();
        System.out.println("Started the car, vroom.");
        mode = park();

    }

    @Override
    public void stop() {
        mode = park();
        System.out.println("Turning off the car, beep beep..");
        off = off();
    }

    @Override
    public String park() {
        return "park";
    }

    @Override
    public String drive() {
        return "drive";
    }

    @Override
    public void driveCar() {
        mode = drive();

    }

    @Override
    public String reverse() {
        return "reverse";
    }

    @Override
    public void reverseCar() {
        mode = reverse();
    }

    @Override
    public boolean off() {
        return true;
    }

    @Override
    public boolean on() {
        return true;
    }

    // Getters and Setters

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }
}
