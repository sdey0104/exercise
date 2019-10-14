package InheritenceChallenge;

public class Vehicles {

    private int handSteering;
    private int changeingGears;
    private int moving;
    private double speed;

    public Vehicles(int handSteering, int changeingGears, int moving,double speed) {
        this.handSteering = handSteering;
        this.changeingGears = changeingGears;
        this.moving = moving;
        this.speed = speed;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public int getChangeingGears() {
        return changeingGears;
    }

    public int getMoving() {
        return moving;
    }

    public double getSpeed() {
        return speed;
    }

    private void startEngine(int changeingGears){
        System.out.printf("vehicle strt");
    }

    private void stopEngine(int flag){
        System.out.println(flag);
    }
}
