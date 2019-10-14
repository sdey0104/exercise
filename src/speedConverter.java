import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class speedConverter {

    public static void main(String[] arg) {
        double kiloMetersPerHour = 15.9039;
        //  printMegaBytesANdKiloBytes(2050);
        // printConversion(kiloMetersPerHour);
        //     double milesPerHour =  toMilesperHour(kiloMetersPerHour);
        //  System.out.println( kiloMetersPerHour + " "+"converted to miles per hour and answer is "+"  "+ milesPerHour);
        //boolean x = shouldWakeUp(true, 44);
        // checkleapyear();
       /* boolean x = isLeapyear(-1000);
        if (x) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/
      //  boolean status = areEqualByThreeDecimalPlaces(0.034, -0.034123);
       // boolean status = hasEqualSum(-2, 1, -1);
    //   boolean status = hasTeen(0,0,-13);
        //System.out.println(status);
    }

    private static double toMilesperHour(double kiloMetersperHour) {
        double milesPerHour;
        milesPerHour = kiloMetersperHour / 1.609344;
        if (milesPerHour < 0) {
            return -1;
        } else if (milesPerHour > 0) {
            return Math.round(milesPerHour);

        }

        return 0;
    }

    public static void printConversion(double kilometerPerHour) {
        //double zero = 0;
        if (kilometerPerHour < 0) {
            // return "Invalid Value";
        } else {
            System.out.println(kilometerPerHour + "km/h =" + Math.round(kilometerPerHour / 1.609) + " mi/h");
        }

    }

    public static void printMegaBytesANdKiloBytes(int kiloBytes) {
        //1 kb = 0.001 mb
        DecimalFormat df = new DecimalFormat("####.####");
        double megaBytes;
        String remainingKb;
        int MB;
        int KB;
        //= {"" , ""};
        String remaining = "";
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            Double kb = new Double(kiloBytes);
            megaBytes = kb / 1024;
          /*  remainingKb = Double.toString(megaBytes);
            String[] arrOfStr = remainingKb.split(".", 3);
          */
            MB = ((int) megaBytes);
           /* remainingKb = arrOfStr[2];
            if (remainingKb.length() > 2) {
                remainingKb = remainingKb.substring(0, 3);
            }*/
            KB = kiloBytes % 1024;
            // remainingKb = kilobytesRemaining[0];
            //= (megaBytes) - kiloBytes/1024;

            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay <= 23) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isLeapyear(int year) {
        if (year > 0 && year <= 9999) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void checkleapyear() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        number1 = number1 * 1000;
        number2 = number2 * 1000;

        long x = (long) number1;
        long y = (long) number2;
        if (x == y) {
            return true;
        }

        return false;
    }

    public static boolean hasEqualSum(int n1, int n2, int n3) {
        n1 = n1 + n2;
        if (n1 == n3) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        for (int i = 13; i <= 19; i++) {
            if (n1 == i) {
                return true;
            } else if (n2 == i) {
                return true;
            } else if (n3 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int n1) {
        for (int i = 13; i <= 19; i++) {
            if (n1 == i) {
                return true;
            }
        }
        return false;
    }
}




