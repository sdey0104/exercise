package Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesAvailable;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, int pagesAvailable, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesAvailable = pagesAvailable;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesAvailable() {
        return pagesAvailable;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }


    public String fillToner(int fill) {
        if (tonerLevel <= 50) {
            return ("Toner Filled");
        } else {
            return ("enough toner left");
        }
    }


    public String printPage(int noOfpages, boolean bothSides) {

        int tonerused = noOfpages;
        if ((noOfpages >= 100 && !bothSides)) {
            return "Insufficient page available";
        } else if (bothSides) {
            noOfpages = noOfpages / 2 + noOfpages % 2;
            if (noOfpages >= 50) {
                return "Insufficient page available";
            }

        }
        System.out.println("pages printing.......");
        System.out.println("pages printed........");
        this.tonerLevel = this.tonerLevel - tonerused;
        this.pagesAvailable = this.pagesAvailable - noOfpages;
        this.pagesPrinted = noOfpages;
        return "completed";

    }

    public String printerStatus() {
        return ("no. of pages printed " + this.pagesPrinted + "\n toner level :" + this.tonerLevel + "\n pages available : " + this.pagesAvailable);
    }


}
