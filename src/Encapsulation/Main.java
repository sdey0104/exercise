package Encapsulation;

public class Main {

    public static void main(String[] arg){
        Printer printer = new Printer(100,100,false);
        System.out.println(printer.printerStatus());
        System.out.println(printer.printPage(60,false));
        System.out.println(printer.printerStatus());
        System.out.println(printer.fillToner(200));
    }
}
