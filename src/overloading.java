import java.text.DecimalFormat;

public class overloading {

    public static void main(String[] arg) {
        System.out.println("inches converted to cm is "+ calcFeetAndInchesToCentimeters(-5));
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimenter;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            centimenter = feet * 30.48;
            centimenter = centimenter + (inches * 2.54);
        } else {
            return -1;
        }
        return centimenter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
     if(inches<0){
         return -1;
     }
     double feet = (int) inches /12;
     double remainingInches = (int) inches % 12;
     return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }


}
