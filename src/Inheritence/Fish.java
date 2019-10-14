package Inheritence;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("rest call");
    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        move(speed);
        eat();
    }
    private void moveMuscles(){
        System.out.println("MMC");
    }

    private void moveBackFin(){
        System.out.println("MBF");
    }
}
