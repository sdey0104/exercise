package InheritenceChallenge;

public class Car extends Vehicles {

    private String color;
    private String transmission;

    public Car(int handSteering, int changeingGears, int moving, double speed,String color,String transmission) {
        super(handSteering, changeingGears, moving, speed);
        this.color=color;
        this.transmission=transmission;
    }


    public void startEngine(int gear){
        System.out.println("start with "+ gear + "gear");
    }

    public void type(String type){
        System.out.println(type);
    }
}
