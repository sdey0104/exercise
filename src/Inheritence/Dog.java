package Inheritence;

import com.sun.corba.se.impl.legacy.connection.USLPort;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("\nDog.chew() called");
    }

    public void eat(){
        System.out.printf("Dog.eat()");
        chew();
      super.eat();
    }

    private void moveLeg(int speed){
        System.out.println("sppeeed");
    }

    public void walk(int speed){
        System.out.println("dog.walk");
        move(speed);
        moveLeg(speed );
    }


}
