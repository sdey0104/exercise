package Composition;

public class Bathroom {

    private int shower;
    private int flush;
    private int basin;

    public Bathroom(int shower, int flush, int basin) {
        this.shower = shower;
        this.flush = flush;
        this.basin = basin;
    }

    public int getShower() {
        return shower;
    }

    public int getFlush() {
        return flush;
    }

    public int getBasin() {
        return basin;
    }


    public String componentsInBathroom() {
        return "no. of shower : " + shower + "\nno. of basin : " + basin + "\nno. of flush :" + flush;
    }

}
