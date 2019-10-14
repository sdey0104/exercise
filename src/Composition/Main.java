package Composition;

public class Main {
    public static void main(String[] arg){

        Bathroom bathroom = new Bathroom(1,1,1);
        BedRoom bedRoom = new BedRoom("double");
        LivingRoom livingRoom = new LivingRoom(3);
        Kitchen kitchen = new Kitchen("Yes");
        Rooms room = new Rooms(bathroom,kitchen,livingRoom,bedRoom);

        Bathroom bathroom1 = new Bathroom(3,4,4);
        BedRoom bedRoom1 = new BedRoom("Single");
        LivingRoom livingRoom1 = new LivingRoom(2);
        Kitchen kitchen1 = new Kitchen("No");
        Rooms room1 = new Rooms(bathroom1,kitchen1,livingRoom1,bedRoom1);

        House house = new House(room);
        System.out.println("\n"+house.getBathroom().componentsInBathroom());
        System.out.println("\n"+house.getBedRoom().validateBedRoom());
        System.out.println("\n"+house.getKitchen().printGas());
        System.out.println("\n"+house.getLivingRoom().noOfTelevision());

        House house1 = new House(room1);
        System.out.println("\n"+house1.getBathroom().componentsInBathroom());
        System.out.println("\n"+house1.getBedRoom().validateBedRoom());
        System.out.println("\n"+house1.getKitchen().printGas());
        System.out.println("\n"+house1.getLivingRoom().noOfTelevision());


    }
}
