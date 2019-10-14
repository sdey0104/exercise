package Polymorphism2;


class Car {
    private boolean engine;
    private int Cyliner;
    private int wheels;
    private String name;

    public Car(int cyliner, String name) {
        this.engine = true;
        this.Cyliner = cyliner;
        this.wheels = 4;
        this.name = name;
    }

    public int getCyliner() {
        return Cyliner;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Engine Started";
    }

    public String accelerator() {
        return "accelerating";
    }

    public String brake() {
        return "stop";
    }
}


class Merc extends Car {

    public Merc(int cyliner) {
        super(cyliner, "merc");
    }

    public String startEngine() {
        return "merc started";

    }

    public String accelerator() {
        return "merc accelerating";
    }

    public String brake() {
        return "merc stop";
    }
}


class Pajero extends Car {
    public Pajero(int cyliner) {
        super(cyliner, "pajero");
    }

    public String startEngine() {
        return "pajero Engine Started";
    }

    public String accelerator() {
        return "pajero accelerating";
    }

    public String brake() {
        return "pajero stop";
    }

}


public class Main {

    public static void main(String[] arg) {

        for (int i = 4; i <= 5; i++) {
        Car car = startCar("pajero",i);
            System.out.println("\n start the car : "+car.startEngine() +
            "\n number of cylinder : "+ car.getCyliner()
            + "\n brake" + car.brake());

        }

    }

    public static Car startCar(String name, int cylinder) {
        //Car car = new Car(cylinder,name);

        switch (name) {
            case "pajero":
                return new Pajero(cylinder);

            case "merc":
                return new Merc(cylinder);

        }

        return null;
    }
}
