package Composition;

public class House {

    private Bathroom bathroom;
    private BedRoom bedRoom;
    private Kitchen kitchen;
    private LivingRoom livingRoom;

    public House(Rooms room){
        this.bathroom = room.getBathroom();
        this.bedRoom=room.getBedRoom();
        this.kitchen=room.getKitchen();
        this.livingRoom=room.getLivingRoom();
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
}
