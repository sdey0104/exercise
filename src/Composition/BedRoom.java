package Composition;

public class BedRoom {

    private String bedComposition;

    public BedRoom(String bedComposition){
        this.bedComposition= bedComposition;
    }

    public String getBedComposition() {
        return bedComposition;
    }

    public String validateBedRoom(){
        if(bedComposition.equals("double")){return "double";}
        return "single";
    }
}
