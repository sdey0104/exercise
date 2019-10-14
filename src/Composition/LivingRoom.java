package Composition;

public class LivingRoom {

    private int television;

    public LivingRoom(int television){
        this.television=television;
    }

    public int getTelevision() {
        return television;
    }

    public String noOfTelevision(){
        return "no. of television : "+television;
    }
}
