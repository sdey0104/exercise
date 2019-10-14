public class minutesToYearAndDayCalculator {

    public static void main(String[] arg) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid values");
        } else {
        long hour = minutes /60;
        long days = hour/24;
        long year = days/365;
        long remainingDays = days % 365;

            System.out.println(minutes + " min = " + year +" " + "y and" + " " + remainingDays + " " + "d");
        }
    }
}
