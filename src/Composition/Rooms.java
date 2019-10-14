package Composition;

public class Rooms {

    private BedRoom bedRoom;
    private Bathroom bathroom;
    private Kitchen kitchen;
    private LivingRoom livingRoom;

    public Rooms(Bathroom bathroom,Kitchen kitchen,LivingRoom livingRoom,BedRoom bedRoom){
            this.bathroom=bathroom;
            this.bedRoom=bedRoom;
            this.kitchen=kitchen;
            this.livingRoom=livingRoom;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
}
